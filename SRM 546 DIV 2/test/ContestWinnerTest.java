import org.junit.Test;
import static org.junit.Assert.*;

public class ContestWinnerTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] events = new int[] {4,7,4,1};
		assertEquals(4, new ContestWinner().getWinner(events));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] events = new int[] {10,20,30,40,50};
		assertEquals(10, new ContestWinner().getWinner(events));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] events = new int[] {123,123,456,456,456,123};
		assertEquals(456, new ContestWinner().getWinner(events));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] events = new int[] {1,2,2,3,3,3,4,4,4,4};
		assertEquals(4, new ContestWinner().getWinner(events));
	}

	@Test(timeout=2000)
	public void test4() {
		int[] events = new int[] {1};
		assertEquals(1, new ContestWinner().getWinner(events));
	}

	@Test(timeout=2000)
	public void test5() {
		int[] events = new int[] {2,1 , 1, 2};
		assertEquals(1, new ContestWinner().getWinner(events));
	}
}
