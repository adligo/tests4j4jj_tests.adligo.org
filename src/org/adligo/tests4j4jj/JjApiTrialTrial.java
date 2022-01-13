package org.adligo.tests4j4jj;

import org.junit.jupiter.api.Test;

public class JjApiTrialTrial extends JjSourceFileTrial {

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
}
