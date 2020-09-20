import org.junit.Test;
import static org.junit.Assert.*;

public class TwiceStringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "aba";
		assertEquals("ababa", new TwiceString().getShortest(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "xxxxx";
		assertEquals("xxxxxx", new TwiceString().getShortest(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "topcoder";
		assertEquals("topcodertopcoder", new TwiceString().getShortest(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "abracadabra";
		assertEquals("abracadabracadabra", new TwiceString().getShortest(s));
	}
}
