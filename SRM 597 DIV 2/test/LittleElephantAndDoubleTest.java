import org.junit.Test;
import static org.junit.Assert.*;

public class LittleElephantAndDoubleTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {1, 2};
		assertEquals("YES", new LittleElephantAndDouble().getAnswer(A));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {1, 2, 3};
		assertEquals("NO", new LittleElephantAndDouble().getAnswer(A));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {4, 8, 2, 1, 16};
		assertEquals("YES", new LittleElephantAndDouble().getAnswer(A));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {94, 752, 94, 376, 1504};
		assertEquals("YES", new LittleElephantAndDouble().getAnswer(A));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] A = new int[] {148, 298, 1184};
		assertEquals("NO", new LittleElephantAndDouble().getAnswer(A));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] A = new int[] {7, 7, 7, 7};
		assertEquals("YES", new LittleElephantAndDouble().getAnswer(A));
	}

	@Test(timeout=2000)
	public void test6() {
		int[] A = new int[] {1, 3};
		assertEquals("NO", new LittleElephantAndDouble().getAnswer(A));
	}

	@Test(timeout=2000)
	public void test7() {
		int[] A = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 3};
		assertEquals("NO", new LittleElephantAndDouble().getAnswer(A));
	}

	@Test(timeout=2000)
	public void test8(){
		int[] A = new int[] {40, 4};
		assertEquals("NO", new LittleElephantAndDouble().getAnswer(A));
	}



}
