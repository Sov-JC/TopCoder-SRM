import org.junit.Test;
import static org.junit.Assert.*;

public class BlackAndWhiteSolitaireTest {
	
	@Test(timeout=2000)
	public void test0() {
		String cardFront = "BBBW";
		assertEquals(1, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String cardFront = "WBWBW";
		assertEquals(0, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String cardFront = "WWWWWWWWW";
		assertEquals(4, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}

	@Test(timeout=2000)
	public void test3() {
		String cardFront = "BBWBWWBWBWWBBBWBWBWBBWBBW";
		assertEquals(10, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}

	@Test(timeout=2000)
	public void test4() {
		String cardFront = "BWWW";
		assertEquals(1, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
}
