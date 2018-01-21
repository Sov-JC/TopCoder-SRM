import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] result = new String[] {"ooo",
 "ooo"};
		assertEquals(6, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] result = new String[] {"ooo",
 "oo-",
 "o--"};
		assertEquals(6, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] result = new String[] {"ooo",
 "---",
 "oo-",
 "---",
 "o--"};
		assertEquals(6, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] result = new String[] {"o--",
 "o--",
 "o--",
 "ooo",
 "---"};
		assertEquals(6, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] result = new String[] {"---",
 "o--",
 "oo-",
 "ooo",
 "ooo",
 "oo-",
 "o--",
 "---"};
		assertEquals(12, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] result = new String[] {"---",
 "---",
 "---",
 "---",
 "---",
 "---"};
		assertEquals(0, new FoxAndGame().countStars(result));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String[] result = new String[] {"oo-"};
		assertEquals(2, new FoxAndGame().countStars(result));
	}
}
