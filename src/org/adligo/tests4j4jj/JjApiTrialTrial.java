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
  }
}
