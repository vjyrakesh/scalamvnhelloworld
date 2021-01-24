package samples

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SampleJunit {

  @Test
  def testHelloWorld(): Unit = {
//    assert(1==2, "Not equal")
    assertTrue(1==2, "Not equal")
  }

}
