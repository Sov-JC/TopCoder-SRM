import org.junit.Test;
import static org.junit.Assert.*;

public class AddMultiplyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int y = 6;
		assertArrayEquals(new int[] {2, 2, 2 }, new AddMultiply().makeExpression(y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int y = 11;
		assertArrayEquals(new int[] {2, 3, 5 }, new AddMultiply().makeExpression(y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int y = 0;
		assertArrayEquals(new int[] {7, 10, -70 }, new AddMultiply().makeExpression(y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int y = 500;
		assertArrayEquals(new int[] {-400, -3, -700 }, new AddMultiply().makeExpression(y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int y = 2;
		assertArrayEquals(new int[] {2, 2, -2 }, new AddMultiply().makeExpression(y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int y = 5;
		assertArrayEquals(new int[] {5, 2, -5 }, new AddMultiply().makeExpression(y));
	}


}
