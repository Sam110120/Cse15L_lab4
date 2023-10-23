import static org.junit.Assert.*;

import java.beans.Transient;

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
  public void test1(){
    int[] input = {1,2,3,4,5,6};
    int[] output = {6,5,4,3,2,1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(output, input);
  }

  @Test 
  public void test2(){
    int[] input = {1,2,3,4};
    int[] output = {4,3,2,1};
    input = ArrayExamples.reversed(input);
    assertArrayEquals(output, input);
  }
}
