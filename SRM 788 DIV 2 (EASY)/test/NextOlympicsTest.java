import org.junit.Test;
import static org.junit.Assert.*;

public class NextOlympicsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String today = "2020.07.24";
		assertEquals(364, new NextOlympics().countDays(today));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String today = "2020.11.09";
		assertEquals(256, new NextOlympics().countDays(today));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String today = "2021.02.25";
		assertEquals(148, new NextOlympics().countDays(today));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String today = "2021.07.23";
		assertEquals(0, new NextOlympics().countDays(today));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String today = "2020.12.31";
		assertEquals(204, new NextOlympics().countDays(today));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String today = "2021.01.01";
		assertEquals(203, new NextOlympics().countDays(today));
	}
}
