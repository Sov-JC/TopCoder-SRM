import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheArithmeticProgression {
	
	public double minimumChange(int a, int b, int c) {
		double aa = -c + 2 * b;
		double bb = (c+a)/2.0;
		double cc = 2*b-a;
		double minimum = Math.abs(a-aa);
		minimum = Math.min(minimum, Math.abs(bb-b));
		minimum = Math.min(minimum, Math.abs(cc-c));
		return minimum;
	}
}
