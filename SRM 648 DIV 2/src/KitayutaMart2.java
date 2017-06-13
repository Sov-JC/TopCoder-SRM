import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class KitayutaMart2 {
	
	public int numBought(int K, int T) {
		int i=0;
		int cost=0;
		while(true){
			cost += new Double(K * Math.pow(2, (i++))).intValue();
			if(cost == T)
				return i;
		}
	}
}
