import org.junit.Test;
import static org.junit.Assert.*;

public class NetworkXZeroOneTest {
	
	@Test(timeout=2000)
	public void test0() {
		String message = "x?x?";
		assertEquals("xoxo", new NetworkXZeroOne().reconstruct(message));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String message = "?xo?";
		assertEquals("oxox", new NetworkXZeroOne().reconstruct(message));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String message = "xo";
		assertEquals("xo", new NetworkXZeroOne().reconstruct(message));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String message = "o??x??o";
		assertEquals("oxoxoxo", new NetworkXZeroOne().reconstruct(message));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String message = "???????x";
		assertEquals("oxoxoxox", new NetworkXZeroOne().reconstruct(message));
	}
}
