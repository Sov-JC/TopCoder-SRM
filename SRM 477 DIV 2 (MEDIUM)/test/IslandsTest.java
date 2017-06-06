import org.junit.Test;
import static org.junit.Assert.*;

public class IslandsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] kingdom = new String[] {".#...#.."};
		assertEquals(4, new Islands().beachLength(kingdom));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] kingdom = new String[] {"..#.##", 
 ".##.#.", 
 "#.#..."};
		assertEquals(19, new Islands().beachLength(kingdom));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] kingdom = new String[] {"#...#.....",
 "##..#...#."};
		assertEquals(15, new Islands().beachLength(kingdom));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] kingdom = new String[] {"....#.",
 ".#....",
 "..#..#",
 "####.."};
		assertEquals(24, new Islands().beachLength(kingdom));
	}
}
