import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class WinterAndMandarins {
	
	public int getNumber(int[] bags, int K) {
		int n = bags.length;
		Arrays.sort(bags);

		int min = bags[n-1] - bags[0];
		for(int first=0; first<n; first++){
			for(int last=first+1; last < n; last++){
				int difference = bags[last]-bags[first];

				int inbetweenCount = 0;
				for(int i=0; i<n; i++)
					if(inbetween(bags[i], bags[first], bags[last]))
							inbetweenCount++;

				if(inbetweenCount >= K)
					min = Math.min(min, difference);
			}
		}

		return min;
	}

	boolean inbetween(int x, int first, int second){
		if(first>second)
			second = first;

		return x <= second && x >= first ? true : false;
	}
}
