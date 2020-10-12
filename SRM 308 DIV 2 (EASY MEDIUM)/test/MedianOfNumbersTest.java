import org.junit.Test;
import static org.junit.Assert.*;

public class MedianOfNumbersTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] numbers = new int[] {1, 4, 2, 5, 7};
		assertEquals(4, new MedianOfNumbers().findMedian(numbers));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] numbers = new int[] {1, 5, 8, 3};
		assertEquals(-1, new MedianOfNumbers().findMedian(numbers));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] numbers = new int[] {7};
		assertEquals(7, new MedianOfNumbers().findMedian(numbers));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] numbers = new int[] {7, 12};
		assertEquals(-1, new MedianOfNumbers().findMedian(numbers));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] numbers = new int[] {66, 53, 47, 86, 18, 21, 97, 92, 15};
		assertEquals(53, new MedianOfNumbers().findMedian(numbers));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] numbers = new int[] {32, 54, 27, 4, 69, 96, 73, 1, 100, 15, 21};
		assertEquals(32, new MedianOfNumbers().findMedian(numbers));
	}
}
