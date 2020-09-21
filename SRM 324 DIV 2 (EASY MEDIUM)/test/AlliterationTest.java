import org.junit.Test;
import static org.junit.Assert.*;

public class AlliterationTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] {"He", "has", "four", "fanatic", "fantastic", "fans"};
		assertEquals(2, new Alliteration().count(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] {"There", "may", "be", "no", "alliteration", "in", "a", "sequence"};
		assertEquals(0, new Alliteration().count(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] {"Round", "the", "rugged", "rock", "the", "ragged", "rascal", "ran"};
		assertEquals(2, new Alliteration().count(words));
	}
}
