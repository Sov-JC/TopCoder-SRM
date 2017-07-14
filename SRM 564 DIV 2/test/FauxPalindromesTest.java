import org.junit.Test;
import static org.junit.Assert.*;

public class FauxPalindromesTest {
	
	@Test(timeout=2000)
	public void test0() {
		String word = "ANA";
		assertEquals("PALINDROME", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String word = "AAAAANNAA";
		assertEquals("FAUX", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String word = "LEGENDARY";
		assertEquals("NOT EVEN FAUX", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String word = "XXXYTYYTTYX";
		assertEquals("FAUX", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String word = "TOPCOODEREDOOCPOT";
		assertEquals("PALINDROME", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String word = "TOPCODEREDOOCPOT";
		assertEquals("FAUX", new FauxPalindromes().classifyIt(word));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String word = "XXXXYYYYYZZXXYYY";
		assertEquals("NOT EVEN FAUX", new FauxPalindromes().classifyIt(word));
	}
}
