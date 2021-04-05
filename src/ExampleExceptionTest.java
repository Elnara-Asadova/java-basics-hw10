import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        {1, 0, 0},
        {5, 5, 25}
    };
  }

  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        {-2, -2},
        {0, -1}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    assertEquals(ExampleException.rectangleArea(a,b), c, "Result is not correct");
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {
    assertEquals(ExampleException.rectangleArea(a,b), -1, "Result is not correct");
  }
}