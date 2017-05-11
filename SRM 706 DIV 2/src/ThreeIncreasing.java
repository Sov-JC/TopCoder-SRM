import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThreeIncreasing {
	
	public int minEaten(int a, int b, int c) {
		int sum = 0;

		int min = a;
		min = Math.min(min,b);
		min = Math.min(min, c);
		sum+= a-min;
		a=min;

		min = Math.min(b,c);
		sum+= b-min;
		b=min;

		if(c==b){
			b--;
			sum++;
		}

		if(b==a){
			a--;
			sum++;
		}else if(b==a-1){
			a=a-2;
			sum+=2;
		}

		return a >= 1 ? sum : -1;
	}
}
