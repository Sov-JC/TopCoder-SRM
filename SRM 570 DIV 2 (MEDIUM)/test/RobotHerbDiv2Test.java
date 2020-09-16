import org.junit.Test;
import static org.junit.Assert.*;

public class RobotHerbDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int T = 1;
		int[] a = new int[] {1,2,3};
		assertEquals(2, new RobotHerbDiv2().getdist(T, a));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int T = 100;
		int[] a = new int[] {1};
		assertEquals(0, new RobotHerbDiv2().getdist(T, a));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int T = 5;
		int[] a = new int[] {1,1,2};
		assertEquals(10, new RobotHerbDiv2().getdist(T, a));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int T = 100;
		int[] a = new int[] {400000};
		assertEquals(40000000, new RobotHerbDiv2().getdist(T, a));
	}
}
