package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for the Triangle implementation, is Statement Coverage compliant.
 */
public class TriangleTest {

  /** Wrapper to avoid code duplication in test methods. */
  private void testTriangle(Type expected, int a, int b, int c) {
    assertEquals(expected, Triangle.classify(a, b, c));
  }

  @Test
  public void testDummy() {
    // Cover the default constructor.
    Triangle a = new Triangle();
  }

  @Test
  public void testInvalid() {
    testTriangle(Type.INVALID, 0, 0, 0);
    testTriangle(Type.INVALID, 1, 2, 4);
    testTriangle(Type.INVALID, 2, 2, 4);
  }

  @Test
  public void testScalene() {
    testTriangle(Type.SCALENE, 8, 6, 4);
  }

  @Test
  public void testEquilateral() {
    testTriangle(Type.EQUILATERAL, 1, 1, 1);
  }

  @Test
  public void testIsosceles() {
    testTriangle(Type.ISOSCELES, 2, 2, 1);
    testTriangle(Type.ISOSCELES, 2, 1, 2);
    testTriangle(Type.ISOSCELES, 1, 2, 2);
  }
}
