import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TimeTravellingCellar {
	
	public int determineProfit(int[] profit, int[] decay) {
		int max = 0;


		for(int i=0; i<profit.length; i++){
			for(int j=0; j<decay.length; j++){
				if(i==j) continue;
				max = Math.max(max, profit[i]-decay[j]);
			}
		}

		return max;
	}
}
