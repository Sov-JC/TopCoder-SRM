import org.junit.Test;
import static org.junit.Assert.*;

public class CucumberMarketTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] price = new int[] {1000,1,10,100};
		int budget = 1110;
		int k = 3;
		assertEquals("YES", new CucumberMarket().check(price, budget, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] price = new int[] {1000,1,10,100};
		int budget = 1109;
		int k = 3;
		assertEquals("NO", new CucumberMarket().check(price, budget, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] price = new int[] {33,4};
		int budget = 33;
		int k = 1;
		assertEquals("YES", new CucumberMarket().check(price, budget, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] price = new int[] {1,1,1,1,1,1};
		int budget = 2;
		int k = 4;
		assertEquals("NO", new CucumberMarket().check(price, budget, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] price = new int[] {1000,1000,1000,1000,1000,1000,1000,1000,1000};
		int budget = 10000;
		int k = 9;
		assertEquals("YES", new CucumberMarket().check(price, budget, k));
	}
}
