import org.junit.Test;
import static org.junit.Assert.*;

public class HuffmanDecodingTest {
	
	@Test(timeout=2000)
	public void test0() {
		String archive = "101101";
		String[] dictionary = new String[] {"00","10","01","11"};
		assertEquals("BDC", new HuffmanDecoding().decode(archive, dictionary));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String archive = "10111010";
		String[] dictionary = new String[] {"0","111","10"};
		assertEquals("CBAC", new HuffmanDecoding().decode(archive, dictionary));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String archive = "0001001100100111001";
		String[] dictionary = new String[] {"1","0"};
		assertEquals("BBBABBAABBABBAAABBA", new HuffmanDecoding().decode(archive, dictionary));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String archive = "111011011000100110";
		String[] dictionary = new String[] {"010","00","0110","0111","11","100","101"};
		assertEquals("EGGFAC", new HuffmanDecoding().decode(archive, dictionary));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String archive = "001101100101100110111101011001011001010";
		String[] dictionary = new String[] {"110","011","10","0011","00011","111","00010","0010","010","0000"};
		assertEquals("DBHABBACAIAIC", new HuffmanDecoding().decode(archive, dictionary));
	}
}
