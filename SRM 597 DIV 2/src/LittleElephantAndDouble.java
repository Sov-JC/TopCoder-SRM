import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LittleElephantAndDouble {
	
	public String getAnswer(int[] A) {
		Arrays.sort(A);
		int largest = A[A.length-1];

		String x = Integer.toBinaryString(largest);

		for(int a: A) {
			String y = Integer.toBinaryString(a);
			if (x.indexOf(Integer.toBinaryString(a << (x.length()-y.length()))) == -1)
				return "NO";
		}

		return "YES";
	}
}
