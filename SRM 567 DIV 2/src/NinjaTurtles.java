import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NinjaTurtles {
	
	public int countOpponents(int P, int K) {

		int min = Integer.MAX_VALUE;

		int N = 3*P*K/(9+K);

		for(int i=0; i<=K; i++){
			int x = (N-i)/K*3 + (N-i)/3;
			int y = (N+i)/K*3 + (N+i)/3;


			if(x == P && (N-i >=0))
				min = Math.min(min, N-i);
			if(y == P)
				min = Math.min(min, N+i);
		}

		if(min==Integer.MAX_VALUE)
			return -1;
		else
			return min;
	}
}
