import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StarsInTheSkyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 4;
		int[] X = new int[] {1, 2, 3, 4};
		int[] Y = new int[] {1, 1, 1, 1};
		Assert.assertEquals(10, new StarsInTheSky().countPictures(N, X, Y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 4;
		int[] X = new int[] {100, 200, 200, 100};
		int[] Y = new int[] {100, 100, 200, 200};
		Assert.assertEquals(9, new StarsInTheSky().countPictures(N, X, Y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 3;
		int[] X = new int[] {10000, 11000, 12000};
		int[] Y = new int[] {52000, 50000, 51000};
		Assert.assertEquals(7, new StarsInTheSky().countPictures(N, X, Y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 7;
		int[] X = new int[] {0, 6, 2, 3, 4, 0, 6};
		int[] Y = new int[] {0, 0, 4, 5, 6, 10, 10};
		Assert.assertEquals(45, new StarsInTheSky().countPictures(N, X, Y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int N = 15;
		int[] X = new int[] {3, 141592653, 589793238, 462643383, 279502884, 197169399, 375105820, 974944592, 307816406, 286208998, 628034825, 342117067, 982148086, 513282306, 647093844};
		int[] Y = new int[] {1, 414213562, 373095048, 801688724, 209698078, 569671875, 376948073, 176679737, 990732478, 462107038, 850387534, 327641572, 735013846, 230912297, 24924836};
		Assert.assertEquals(613, new StarsInTheSky().countPictures(N, X, Y));
	}
}
