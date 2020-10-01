import org.junit.Test;
import static org.junit.Assert.*;

public class RosePetalsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] dice = new int[] {1, 2, 3, 2, 1};
		assertEquals(2, new RosePetals().getScore(dice));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] dice = new int[] {4, 4, 5, 6, 5};
		assertEquals(8, new RosePetals().getScore(dice));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] dice = new int[] {1, 2, 3, 3, 5};
		assertEquals(8, new RosePetals().getScore(dice));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] dice = new int[] {3, 3, 3, 3, 3};
		assertEquals(10, new RosePetals().getScore(dice));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] dice = new int[] {2, 2, 2, 2, 2};
		assertEquals(0, new RosePetals().getScore(dice));
	}
}
