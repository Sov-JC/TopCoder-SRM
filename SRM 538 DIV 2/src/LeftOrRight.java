import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LeftOrRight {
	
	public int maxDistance(String program) {
		String r = program.replace('?', 'R');
		String l = program.replace('?', 'L');
		int max = 0;

		int x = 0;
		for(char c: r.toCharArray()) {
			if (c == 'R')
				x++;
			else
				x--;

			max = Math.max(max, Math.abs(x));
		}

		x = 0;
		for(char c: l.toCharArray()) {
			if (c == 'L')
				x++;
			else
				x--;

			max = Math.max(max, Math.abs(x));
		}

		return max;
	}
}
