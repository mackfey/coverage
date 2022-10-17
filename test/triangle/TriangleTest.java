package triangle;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

  /**
   * Wrapper to avoid code duplication in test methods.
   */
  private void testTriangle(int a, int b, int c, Type expected) {
    Type actual = Triangle.classify(a, b, c);

    assertEquals(expected, actual);
  }

  @Test
  public void testDummy() {
    // Cover the default constructor to make Cobertura happy.
    Triangle a = new Triangle();
  }

  @Test
  public void testTable() {
    testTriangle(0, 0, 0, INVALID);
  }
}
