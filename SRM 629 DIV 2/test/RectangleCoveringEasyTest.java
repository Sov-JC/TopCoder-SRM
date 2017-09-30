import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleCoveringEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int holeH = 1;
		int holeW = 1;
		int boardH = 1;
		int boardW = 1;
		assertEquals(-1, new RectangleCoveringEasy().solve(holeH, holeW, boardH, boardW));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int holeH = 3;
		int holeW = 5;
		int boardH = 4;
		int boardW = 6;
		assertEquals(1, new RectangleCoveringEasy().solve(holeH, holeW, boardH, boardW));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int holeH = 10;
		int holeW = 20;
		int boardH = 25;
		int boardW = 15;
		assertEquals(1, new RectangleCoveringEasy().solve(holeH, holeW, boardH, boardW));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int holeH = 3;
		int holeW = 10;
		int boardH = 3;
		int boardW = 12;
		assertEquals(1, new RectangleCoveringEasy().solve(holeH, holeW, boardH, boardW));
	}
}
