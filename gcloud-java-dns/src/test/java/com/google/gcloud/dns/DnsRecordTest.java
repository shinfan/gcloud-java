/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.dns;

import static com.google.gcloud.dns.DnsRecord.builder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class DnsRecordTest {

  private static final String NAME = "example.com.";
  private static final Integer TTL = 3600;
  private static final TimeUnit UNIT = TimeUnit.HOURS;
  private static final Integer UNIT_TTL = 1;
  private static final DnsRecord.Type TYPE = DnsRecord.Type.AAAA;
  private static final DnsRecord record = builder(NAME, TYPE)
      .ttl(UNIT_TTL, UNIT)
      .build();

  @Test
  public void testDefaultDnsRecord() {
    DnsRecord record = builder(NAME, TYPE).build();
    assertEquals(0, record.records().size());
    assertEquals(TYPE, record.type());
    assertEquals(NAME, record.name());
  }

  @Test
  public void testBuilder() {
    assertEquals(NAME, record.name());
    assertEquals(TTL, record.ttl());
    assertEquals(TYPE, record.type());
    assertEquals(0, record.records().size());
    // verify that one can add records to the record set
    String testingRecord = "Testing record";
    String anotherTestingRecord = "Another record 123";
    DnsRecord anotherRecord = record.toBuilder()
        .addRecord(testingRecord)
        .addRecord(anotherTestingRecord)
        .build();
    assertEquals(2, anotherRecord.records().size());
    assertTrue(anotherRecord.records().contains(testingRecord));
    assertTrue(anotherRecord.records().contains(anotherTestingRecord));
  }

  @Test
  public void testValidTtl() {
    try {
      builder(NAME, TYPE).ttl(-1, TimeUnit.SECONDS);
      fail("A negative value is not acceptable for ttl.");
    } catch (IllegalArgumentException e) {
      // expected
    }
    builder(NAME, TYPE).ttl(0, TimeUnit.SECONDS);
    builder(NAME, TYPE).ttl(Integer.MAX_VALUE, TimeUnit.SECONDS);
    try {
      builder(NAME, TYPE).ttl(Integer.MAX_VALUE, TimeUnit.HOURS);
      fail("This value is too large for int.");
    } catch (IllegalArgumentException e) {
      // expected
    }
    DnsRecord record = DnsRecord.builder(NAME, TYPE).ttl(UNIT_TTL, UNIT).build();
    assertEquals(TTL, record.ttl());
  }

  @Test
  public void testEqualsAndNotEquals() {
    DnsRecord clone = record.toBuilder().build();
    assertEquals(record, clone);
    clone = record.toBuilder().addRecord("another record").build();
    assertNotEquals(record, clone);
    String differentName = "totally different name";
    clone = record.toBuilder().name(differentName).build();
    assertNotEquals(record, clone);
    clone = record.toBuilder().ttl(record.ttl() + 1, TimeUnit.SECONDS).build();
    assertNotEquals(record, clone);
    clone = record.toBuilder().type(DnsRecord.Type.TXT).build();
    assertNotEquals(record, clone);
  }

  @Test
  public void testSameHashCodeOnEquals() {
    int hash = record.hashCode();
    DnsRecord clone = record.toBuilder().build();
    assertEquals(clone.hashCode(), hash);
  }

  @Test
  public void testToAndFromPb() {
    assertEquals(record, DnsRecord.fromPb(record.toPb()));
    DnsRecord partial = builder(NAME, TYPE).build();
    assertEquals(partial, DnsRecord.fromPb(partial.toPb()));
    partial = builder(NAME, TYPE).addRecord("test").build();
    assertEquals(partial, DnsRecord.fromPb(partial.toPb()));
    partial = builder(NAME, TYPE).ttl(15, TimeUnit.SECONDS).build();
    assertEquals(partial, DnsRecord.fromPb(partial.toPb()));
  }

  @Test
  public void testToBuilder() {
    assertEquals(record, record.toBuilder().build());
    DnsRecord partial = builder(NAME, TYPE).build();
    assertEquals(partial, partial.toBuilder().build());
    partial = builder(NAME, TYPE).addRecord("test").build();
    assertEquals(partial, partial.toBuilder().build());
    partial = builder(NAME, TYPE).ttl(15, TimeUnit.SECONDS).build();
    assertEquals(partial, partial.toBuilder().build());
  }

  @Test
  public void clearRecordSet() {
    // make sure that we are starting not empty
    DnsRecord clone = record.toBuilder().addRecord("record").addRecord("another").build();
    assertNotEquals(0, clone.records().size());
    clone = clone.toBuilder().clearRecords().build();
    assertEquals(0, clone.records().size());
    clone.toPb(); // verify that pb allows it
  }

  @Test
  public void removeFromRecordSet() {
    String recordString = "record";
    // make sure that we are starting not empty
    DnsRecord clone = record.toBuilder().addRecord(recordString).build();
    assertNotEquals(0, clone.records().size());
    clone = clone.toBuilder().removeRecord(recordString).build();
    assertEquals(0, clone.records().size());
  }
}