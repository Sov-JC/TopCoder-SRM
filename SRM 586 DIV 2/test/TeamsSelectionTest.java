import org.junit.Test;
import static org.junit.Assert.*;

public class TeamsSelectionTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] preference1 = new int[] {1, 2, 3, 4};
		int[] preference2 = new int[] {1, 2, 3, 4};
		assertEquals("1212", new TeamsSelection().simulate(preference1, preference2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] preference1 = new int[] {3, 2, 1};
		int[] preference2 = new int[] {1, 3, 2};
		assertEquals("211", new TeamsSelection().simulate(preference1, preference2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] preference1 = new int[] {6, 1, 5, 2, 3, 4};
		int[] preference2 = new int[] {1, 6, 3, 4, 5, 2};
		assertEquals("212211", new TeamsSelection().simulate(preference1, preference2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] preference1 = new int[] {8, 7, 1, 2, 4, 5, 6, 3, 9};
		int[] preference2 = new int[] {7, 2, 4, 8, 1, 5, 9, 6, 3};
		assertEquals("121121212", new TeamsSelection().simulate(preference1, preference2));
	}
}
