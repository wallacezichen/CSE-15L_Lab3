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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWith5Element() {
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.fixedReversed(input1));
  }


  @Test
  public void testReversedWith() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.fixedReverseInPlace(input1);
    System.out.println(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }
}
