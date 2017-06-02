import org.junit.Test;
import static org.junit.Assert.*;

public class grafixCorruptTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] dictionary = new String[] {"cat", "cab", "lab"};
		String candidate = "dab";
		assertEquals(1, new grafixCorrupt().selectWord(dictionary, candidate));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] dictionary = new String[] {"cat", "cab", "lab"};
		String candidate = "lag";
		assertEquals(2, new grafixCorrupt().selectWord(dictionary, candidate));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] dictionary = new String[] {"cat", "cab", "lab"};
		String candidate = "bic";
		assertEquals(-1, new grafixCorrupt().selectWord(dictionary, candidate));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] dictionary = new String[] {"zkv", "izs", "fed", "waa", "ttx", "bgt", "quy", "dtq", "dgo", "yrs",
 "cid", "nln", "pvz", "txt", "zun", "erd", "jen", "klh", "kxy", "emf",
 "mqt", "lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb"};
		String candidate = "cwd";
		assertEquals(10, new grafixCorrupt().selectWord(dictionary, candidate));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] dictionary = new String[] {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw",
 "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin",
 "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy",
 "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki",
 "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw",
 "lxmoncl", "sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr",
 "mklucgt"};
		String candidate = "vklikgf";
		assertEquals(36, new grafixCorrupt().selectWord(dictionary, candidate));
	}

	@Test(timeout=2000)
	public void test5() {
		String[] dictionary = new String[] {"cat", "cab", "lab"};
		String candidate = "c";
		assertEquals(0, new grafixCorrupt().selectWord(dictionary, candidate));
	}
}
