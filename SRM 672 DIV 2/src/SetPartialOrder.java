import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SetPartialOrder {

	public String compareSets(int[] a, int[] b) {

		boolean found = false;
		if (a.length <= b.length) {//a len leq than
			for (int i = 0; i < a.length; i++) {
				found = false;
				for (int j = 0; j < b.length && !found; j++) {
					if ((b[j] == a[i]))
						found = true;
				}
				if (!found)
					return "INCOMPARABLE";
			}
			return a.length==b.length ? "EQUAL" : "LESS";
		} else if (a.length >= b.length) {//a len geq than
			for (int i = 0; i < b.length; i++) {
				found = false;
				for (int j = 0; j < a.length && !found; j++) {
					if ((a[j] == b[i]))
						found = true;
				}
				if (!found)
					return "INCOMPARABLE";
			}
			return a.length==b.length ? "EQUAL" : "GREATER";
		}
		return null;
	}
}


