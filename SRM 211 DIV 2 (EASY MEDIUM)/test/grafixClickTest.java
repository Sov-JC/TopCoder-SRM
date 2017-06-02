import org.junit.Test;
import static org.junit.Assert.*;

public class grafixClickTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] mouseRows = new int[] {20, 39, 100};
		int[] mouseCols = new int[] {99, 50, 200};
		assertArrayEquals(new int[] { 0,  1 }, new grafixClick().checkSaveButton(mouseRows, mouseCols));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] mouseRows = new int[] {0, 100, 399};
		int[] mouseCols = new int[] {0, 200, 599};
		assertArrayEquals(new int[] { }, new grafixClick().checkSaveButton(mouseRows, mouseCols));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] mouseRows = new int[] {30};
		int[] mouseCols = new int[] {75};
		assertArrayEquals(new int[] { 0 }, new grafixClick().checkSaveButton(mouseRows, mouseCols));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] mouseRows = new int[] {10, 20, 30, 30, 30, 30, 34, 35, 345};
		int[] mouseCols = new int[] {10, 20, 30, 50, 60, 80, 34, 35, 345};
		assertArrayEquals(new int[] { 3,  4,  5 }, new grafixClick().checkSaveButton(mouseRows, mouseCols));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] mouseRows = new int[] {57, 28, 18, 25, 36, 12, 33, 44, 13, 32,
 32, 51, 11, 27, 8, 51, 17, 34, 10, 16,
 47, 57, 20, 57, 32, 14, 13, 37, 10, 16,
 49, 37, 52, 8, 18, 44, 50, 43, 11, 1,
 21, 22, 17, 35, 28, 53, 56, 16, 11, 44};
		int[] mouseCols = new int[] {146, 22, 41, 88, 123, 99, 43, 110, 25, 64,
 141, 110, 70, 34, 99, 103, 60, 64, 142, 109,
 133, 144, 72, 68, 25, 32, 21, 140, 30, 105,
 32, 72, 114, 97, 35, 131, 103, 110, 133, 81,
 125, 36, 76, 78, 77, 47, 50, 94, 22, 20};
		assertArrayEquals(new int[] { 3,  9,  17,  22,  31,  43,  44 }, new grafixClick().checkSaveButton(mouseRows, mouseCols));
	}
}
