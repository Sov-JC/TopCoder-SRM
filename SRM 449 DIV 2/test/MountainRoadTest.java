import org.junit.Test;
import static org.junit.Assert.*;

public class MountainRoadTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] start = new int[] {1};
		int[] finish = new int[] {7};
		assertEquals(8.485281374238571, new MountainRoad().findDistance(start, finish), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] start = new int[] {0,3,4};
		int[] finish = new int[] {5,9,6};
		assertEquals(12.727922061357857, new MountainRoad().findDistance(start, finish), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] start = new int[] {1,4,5,6,-10};
		int[] finish = new int[] {101,102,101,100,99};
		assertEquals(158.39191898578665, new MountainRoad().findDistance(start, finish), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] start = new int[] {-5,-3};
		int[] finish = new int[] {-2,-2};
		assertEquals(4.242640687119286, new MountainRoad().findDistance(start, finish), 1e-9);
	}
}
