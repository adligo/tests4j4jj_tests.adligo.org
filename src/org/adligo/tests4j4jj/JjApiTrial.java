package org.adligo.tests4j4jj;

import org.junit.jupiter.api.Test;

public class JjApiTrial extends JjSourceFileTrial {

  @Test
  public void testLegacyApi() {
    assertEquals(123, 123);
    assertEquals("123", "123");
  }
}
