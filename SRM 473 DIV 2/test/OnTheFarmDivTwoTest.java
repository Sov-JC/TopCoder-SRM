import org.junit.Test;
import static org.junit.Assert.*;

public class OnTheFarmDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int heads = 3;
		int legs = 8;
		assertArrayEquals(new int[] {2, 1 }, new OnTheFarmDivTwo().animals(heads, legs));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int heads = 10;
		int legs = 40;
		assertArrayEquals(new int[] {0, 10 }, new OnTheFarmDivTwo().animals(heads, legs));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int heads = 10;
		int legs = 42;
		assertArrayEquals(new int[] { }, new OnTheFarmDivTwo().animals(heads, legs));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int heads = 1;
		int legs = 3;
		assertArrayEquals(new int[] { }, new OnTheFarmDivTwo().animals(heads, legs));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int heads = 0;
		int legs = 0;
		assertArrayEquals(new int[] {0, 0 }, new OnTheFarmDivTwo().animals(heads, legs));
	}
}
