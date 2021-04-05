public class ExampleException {
  static void check(int firstSide,int secondSide) throws IllegalArgumentException {
    if (firstSide < 0 || secondSide <0) {
      throw new IllegalArgumentException("input value is below zero!");
    }
  }

  public static int rectangleArea(int firstSide, int secondSide) {
    try{
      check(firstSide,secondSide);
    }
    catch (IllegalArgumentException e1){
      System.err.print(e1);
      return -1;
    }
    return firstSide * secondSide;
  }
}


