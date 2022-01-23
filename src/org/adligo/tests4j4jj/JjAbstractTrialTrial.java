package org.adligo.tests4j4jj;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Tests for {@link JjAbstractTrial}
 * @author scott
 * <pre><code>
 *         ---------------- Apache ICENSE-2.0 --------------------------
 *
 *         Copyright 2022 Adligo Inc
 * 
 *         Licensed under the Apache License, Version 2.0 (the "License"); you
 *         may not use this file except in compliance with the License. You may
 *         obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         </code></pre>
 */
public class JjAbstractTrialTrial extends JjSourceFileTrial {

  @Test
  public void testLegacyApi() {
    assertEquals(123, 123);
    assertEquals("123 should match with 123", 123, 123);
    assertEquals(123, 123, "123 should match with 123");
    assertEquals("123", "123");
    assertEquals("String 123 shoudl match string 123", "123", "123");
    
    assertFalse(false);
    assertFalse(false, "should be false");
    assertFalse("should be false", false);
    

    assertNull(null);
    //can only use the legacy JUnit api otherwise migrators will need to modify code as follows
    //assertNull("should be null", (Object) null);
    //assertNull((Object) null, "should be null");
    assertNull(null, "should be null");
    
    assertNotNull("");
    //can only use the legacy JUnit api otherwise migrators will need to modify code as follows
    //assertNull("should be null", (Object) null);
    //assertNull((Object) null, "should be null");
    assertNotNull("", "should be null");
    
    assertNotEquals(123, 1234);
    assertNotEquals("123 should NOT match with 1234", 123, 1234);
    assertNotEquals(123, 1235, "123 should NOT match with 1235");
    assertNotEquals("123", "1236");
    assertNotEquals("String 123 shoudl match string 1237", "123", "1237");
    
    assertNotSame(123, 1234);
    assertNotSame("123 should NOT match with 1234", 123, 1234);
    assertNotSame(123, 1235, "123 should NOT match with 1235");
    assertNotSame("123", "1236");
    
    Object same = new Object();
    assertSame(same, same);
    assertSame("same should match with same", same, same);
    assertSame(same, same, "123 should NOT match with 1235");
    
    assertTrue(true);
    assertTrue(true, "should be false");
    assertTrue("should be false", true);
  }

  @Test
  public void testShortApi() {
    equals(123, 123);
    equals("123 should match 123", 123, 123);
    equals("123", "123");
    equals("String 123 should match String 123", "123", "123");
    
    isFalse(false);
    isFalse("should be false", false);
    
    isNull(null);
    isNull("should be null", null);
    
    notNull("");
    notNull("should be null", "");    
    
    notEquals(123, 1234);
    notEquals("123 should NOT match with 1234", 123, 1234);
    notEquals("123", "1236");
    notEquals("String 123 shoudl match string 1237", "123", "1237");
    
    notSame(123, 1234);
    notSame("123 should NOT match with 1234", 123, 1234);
    
    Object same = new Object();
    same(same, same);
    same("same should match with same", same, same);
    
    isTrue(true);
    isTrue("should be false", true);
  }


  @Test
  public void testShortApiChaining() {
    Integer i = 123;
    same(i, equals(123, i));
    same(i, equals("123 should match 123", 123, i));
    String s = "123";
    same(s, equals("123", s));
    same(s, equals("String 123 should match String 123", "123", s));
    
    
    same(s, notNull(s));
    same(s, notNull("should NOT be null", s));    
    
    same(i, notEquals(1234, i));
    same(i, notEquals("123 should NOT match with 1234", 1234, i));
    same(s, notEquals("1236", s));
    same(s, notEquals("String 123 shoudl match string 1237", "1237", s));
    
    same(i, notSame(1234, i));
    same(i, notSame("123 should NOT match with 1234", 1234, i));
    
    Object same = new Object();
    same(same, same(same, same));
    same(same, same("same should match with same", same, same));
    
  }
  

  @Test
  public void testShortApiThrown() {
    thrown(List.of(new RuntimeException("test Thrown Message")),
        () -> { throw new RuntimeException("test Thrown Message"); });
    thrown(List.of(new RuntimeException("test Thrown Message"),
        new IllegalStateException("test ISE")),
        () -> { 
          IllegalStateException ise = new IllegalStateException("test ISE");
          throw new RuntimeException("test Thrown Message", ise); 
        
        });
    thrown(List.of(new RuntimeException("test Thrown Message"),
        new IllegalStateException("test ISE"),
        new IllegalArgumentException("test IAE")),
        () -> { 
          IllegalArgumentException iae = new IllegalArgumentException("test IAE");
          IllegalStateException ise = new IllegalStateException("test ISE", iae);
          throw new RuntimeException("test Thrown Message", ise); 
        });
    
    //with custom error messages
    thrown("bad code, your message goes here", 
        List.of(new RuntimeException("test Thrown Message")),
        () -> { throw new RuntimeException("test Thrown Message"); });
    thrown("bad code, your message goes here", 
        List.of(new RuntimeException("test Thrown Message"),
        new IllegalStateException("test ISE")),
        () -> { 
          IllegalStateException ise = new IllegalStateException("test ISE");
          throw new RuntimeException("test Thrown Message", ise); 
        
        });
    thrown("bad code, your message goes here", 
        List.of(new RuntimeException("test Thrown Message"),
        new IllegalStateException("test ISE"),
        new IllegalArgumentException("test IAE")),
        () -> { 
          IllegalArgumentException iae = new IllegalArgumentException("test IAE");
          IllegalStateException ise = new IllegalStateException("test ISE", iae);
          throw new RuntimeException("test Thrown Message", ise); 
        });
    
    //
    thrown(false, List.of(new RuntimeException("test Thrown Message")),
        () -> { System.out.println("in thrown run with check = false"); });
    thrown(false, "bad code, your message goes here", 
        List.of(new RuntimeException("test Thrown Message")),
        () -> { System.out.println("in thrown run with check = false"); });
  }
}
