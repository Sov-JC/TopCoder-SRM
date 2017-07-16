import org.junit.Test;
import static org.junit.Assert.*;

public class SurroundingGameEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] cost = new String[] {"21","12"};
		String[] benefit = new String[] {"21","12"};
		String[] stone = new String[] {".o","o."};
		assertEquals(4, new SurroundingGameEasy().score(cost, benefit, stone));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] cost = new String[] {"99","99"};
		String[] benefit = new String[] {"11","11"};
		String[] stone = new String[] {".o","o."};
		assertEquals(-14, new SurroundingGameEasy().score(cost, benefit, stone));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] cost = new String[] {"888","888","888"};
		String[] benefit = new String[] {"000","090","000"};
		String[] stone = new String[] {"...",".o.","..."};
		assertEquals(1, new SurroundingGameEasy().score(cost, benefit, stone));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] cost = new String[] {"4362","4321"};
		String[] benefit = new String[] {"5329","5489"};
		String[] stone = new String[] {"...o","..o."};
		assertEquals(22, new SurroundingGameEasy().score(cost, benefit, stone));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] cost = new String[] {"5413","4323","8321","5490"};
		String[] benefit = new String[] {"0432","7291","3901","2310"};
		String[] stone = new String[] {"ooo.","o..o","...o","oooo"};
		assertEquals(-12, new SurroundingGameEasy().score(cost, benefit, stone));
	}
}
