import org.junit.Test;
import static org.junit.Assert.*;

public class NinjaTurtlesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int P = 5;
		int K = 4;
		assertEquals(6, new NinjaTurtles().countOpponents(P, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int P = 1;
		int K = 4;
		assertEquals(3, new NinjaTurtles().countOpponents(P, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int P = 13;
		int K = 6;
		assertEquals(-1, new NinjaTurtles().countOpponents(P, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int P = 13;
		int K = 17;
		assertEquals(30, new NinjaTurtles().countOpponents(P, K));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int P = 122;
		int K = 21;
		assertEquals(258, new NinjaTurtles().countOpponents(P, K));
	}

	@Test(timeout=2000)
	public void test5() {
		int P = 1000000;
		int K = 99;
		assertEquals(2750007, new NinjaTurtles().countOpponents(P, K));
	}
}
