import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MagicSubset {
	
	public int findBest(int[] values) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<values.length; i++){
			if(values[i] >0)
				sum1+=values[i];
			else
				sum2+=values[i];
		}
		sum2 = ((sum2 + values[0])*(-1));
		if(sum1 < sum2)
			return sum2;
		else
			return sum1;
	}
}
