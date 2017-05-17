import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class UpDownHiking {
	
	public int maxHeight(int N, int A, int B) {
		int limit = N * A;
		double daysUp, daysDown;
		int highest = 0;

		for (int i = 1; i <= limit; i++) {
			daysUp = new Double(Math.ceil(((i + 0.0) / A))).intValue();
			daysDown = new Double(Math.ceil(((i + 0.0) / B))).intValue();
			if (daysUp + daysDown <= N)
				highest = i;
		}
		return highest;
	}
}
