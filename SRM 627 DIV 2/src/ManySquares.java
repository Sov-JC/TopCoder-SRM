import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ManySquares {
	
	public int howManySquares(int[] sticks) {
		Arrays.sort(sticks);

		int last = sticks[0];
		int counter = 1;
		int ans = 0;

		for(int i=1; i<sticks.length; i++){
			if(sticks[i] != last) {
				ans += counter / 4;
				counter = 1;
				last = sticks[i];
			}else{
				counter++;
			}
		}

		ans+=counter/4;

		return ans;
	}
}
