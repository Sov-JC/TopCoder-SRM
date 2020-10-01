import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DigitsSum {
	
	public int lastDigit(int n) {
		String s = Integer.toString(n);

		int sum = 0;

		while(true) {
			for (char c : s.toCharArray()) {
				int x = ((int)c)-((int)'0');

				sum+=x;
			}

			if(Integer.toString(sum).length() == 1)
				return sum;


			s = Integer.toString(sum);
			sum = 0;
		}


	}
}
