import org.junit.Test;
import static org.junit.Assert.*;

public class PenguinTilesTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] tiles = new String[] {"PP",
 "P."};
		assertEquals(0, new PenguinTiles().minMoves(tiles));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] tiles = new String[] {"PPPPPPPP",
 ".PPPPPPP"};
		assertEquals(1, new PenguinTiles().minMoves(tiles));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] tiles = new String[] {"PPP",
 "P.P",
 "PPP"};
		assertEquals(2, new PenguinTiles().minMoves(tiles));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] tiles = new String[] {"P.",
 "PP",
 "PP",
 "PP"};
		assertEquals(1, new PenguinTiles().minMoves(tiles));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] tiles = new String[] {".PPP",
 "PPPP",
 "PPPP",
 "PPPP"};
		assertEquals(2, new PenguinTiles().minMoves(tiles));
	}
}
