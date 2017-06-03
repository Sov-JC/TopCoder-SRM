import org.junit.Test;
import static org.junit.Assert.*;

public class DukeOnChessBoardTest {
	
	@Test(timeout=15)
	public void test0() {
		int n = 3;
		String initPosition = "b2";
		assertEquals("b2-c2-c3-b3-a3-a2-a1-b1-c1", new DukeOnChessBoard().dukePath(n, initPosition));
	}
	
	@Test(timeout=25)
	public void test1() {
		int n = 4;
		String initPosition = "d4";
		assertEquals("d4-d3-d2-d1-c1-c2-c3...b3-b2-b1-a1-a2-a3-a4", new DukeOnChessBoard().dukePath(n, initPosition));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 3;
		String initPosition = "a2";
		assertEquals("a2-b2-c2-c3-b3-a3", new DukeOnChessBoard().dukePath(n, initPosition));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 4;
		String initPosition = "d3";
		assertEquals("d3-d4-c4-c3-c2-d2-d1...b2-b3-b4-a4-a3-a2-a1", new DukeOnChessBoard().dukePath(n, initPosition));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 8;
		String initPosition = "a8";
		assertEquals("a8-b8-c8-d8-e8-f8-g8...a1-a2-a3-a4-a5-a6-a7", new DukeOnChessBoard().dukePath(n, initPosition));
	}
}
