package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

import org.junit.jupiter.api.Test;

/** Test class for the Triangle implementation. */
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
  public void testTable() {
    testTriangle(INVALID, 0, 0, 0);
  }
}
