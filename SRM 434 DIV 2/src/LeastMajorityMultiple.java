import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LeastMajorityMultiple {
	
	public int leastMajorityMultiple(int a, int b, int c, int d, int e) {

		int count;
		int max = 100*100*100;
		for(int i=1; i<max; i++) {
			count=0;
			if(i%a == 0)
				count++;
			if(i%b==0)
				count++;
			if(i%c==0)
				count++;
			if(i%d == 0)
				count++;
			if(i%e==0)
				count++;

			if(count>=3)
				return i;
		}


		return -1;
	}
}
