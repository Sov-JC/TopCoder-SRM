import org.junit.Test;
import static org.junit.Assert.*;

public class CreateGroupsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] groups = new int[] {10,20};
		int minSize = 10;
		int maxSize = 15;
		assertEquals(5, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] groups = new int[] {20,8,6};
		int minSize = 10;
		int maxSize = 15;
		assertEquals(6, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] groups = new int[] {10,20,30};
		int minSize = 1;
		int maxSize = 18;
		assertEquals(-1, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] groups = new int[] {50,10,20,20,5};
		int minSize = 15;
		int maxSize = 30;
		assertEquals(20, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] groups = new int[] {100,200,301};
		int minSize = 200;
		int maxSize = 200;
		assertEquals(-1, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] groups = new int[] {1,10,10}	;
		int minSize = 9;
		int maxSize = 20;
		assertEquals(-1, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] groups = new int[] {55,33,45,71,27,89,16,14,61};
		int minSize = 33;
		int maxSize = 56;
		assertEquals(53, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test7() {
		int[] groups = new int[] {49,60,36,34,36,52,60,43,52,59};
		int minSize = 45;
		int maxSize = 51;
		assertEquals(31, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
	
	@Test(timeout=2000)
	public void test8() {
		int[] groups = new int[] {5,5,5,5,5};
		int minSize = 5;
		int maxSize = 5;
		assertEquals(0, new CreateGroups().minChanges(groups, minSize, maxSize));
	}
}
