import org.junit.Test;
import static org.junit.Assert.*;

public class CountExpressionsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x = 7;
		int y = 8;
		int val = 16;
		assertEquals(9, new CountExpressions().calcExpressions(x, y, val));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x = 3;
		int y = 5;
		int val = 7;
		assertEquals(5, new CountExpressions().calcExpressions(x, y, val));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x = 99;
		int y = 100;
		int val = 98010000;
		assertEquals(6, new CountExpressions().calcExpressions(x, y, val));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x = -99;
		int y = 42;
		int val = -1764;
		assertEquals(2, new CountExpressions().calcExpressions(x, y, val));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int x = 100;
		int y = -100;
		int val = -100000000;
		assertEquals(0, new CountExpressions().calcExpressions(x, y, val));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int x = 1;
		int y = 2;
		int val = 5;
		assertEquals(17, new CountExpressions().calcExpressions(x, y, val));
	}
}
