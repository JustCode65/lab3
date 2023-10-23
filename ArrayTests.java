import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1,2,3,4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4,3,2,1 }, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = { 5,6,7,8,9 };
    assertArrayEquals(new int[]{ 9,8,7,6,5 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowest2(){
    double[] arr =  {2.2,2.2,2.2,2.2};
    assertEquals(2.2, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  }

  @Test
  public void averageWithoutLowest(){
    double[] arr =  {2.2,3.4,5.7,1.1,1.0};
    assertEquals(3.1, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  }
}
