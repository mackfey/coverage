package triangle;

/** This class contains a static method {@link #classify} that classifies triangles. */
public class Triangle {
    
  /** This enum represents the type of the triangle. */
  public static enum Type {
    INVALID,
    SCALENE,
    EQUILATERAL,
    ISOSCELES
  };

  /**
   * This static method classifies a, given the lengths of its three sides.
   *
   * @param a the length of the first side
   * @param b the length of the second side
   * @param c the length of the third side
   * @return the classification of a triangle with side lengths {@code a}, {@code b}, and {@code c}
   */
  public static Type classify(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      return Type.INVALID;
    }
    int numEqualSidePairs = 0;
    if (a == b) {
      numEqualSidePairs = numEqualSidePairs + 1;
    }
    if (a == c) {
      numEqualSidePairs = numEqualSidePairs + 2;
    }
    if (b == c) {
      numEqualSidePairs = numEqualSidePairs + 3;
    }
    if (numEqualSidePairs == 0) {
      if (a + b <= c || a + c <= b || b + c <= a) {
        return Type.INVALID;
      } else {
        return Type.SCALENE;
      }
    }
    if (numEqualSidePairs > 3) {
      return Type.EQUILATERAL;
    }
    if (numEqualSidePairs == 1 && a + b > c) {
      return Type.ISOSCELES;
    } else if (numEqualSidePairs == 2 && a + c > b) {
      return Type.ISOSCELES;
    } else if (numEqualSidePairs == 3 && b + c > a) {
      return Type.ISOSCELES;
    }
    return Type.INVALID;
  }
}
