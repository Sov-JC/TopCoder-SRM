import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FixedDiceGameDiv2 {
	
	public double getExpectation(int a, int b) {

		double expVal = 0;

		double aliceWinning = 0;

		for(int i=1;i<=a;i++)
			for(int y=1; y<=b; y++)
				if (i > y)
					aliceWinning += (1.0 / (a * b));

		//conditional part
		for(int i=1;i<=a;i++)
			expVal += (i*(probIandWins(a,b,i) / aliceWinning));

		return expVal;
	}

	//probability Alice rolls an i and wins off of that roll
	private static double probIandWins(int a, int b, int i){
		double probability = 0;

		for(int y=1;y<=b;y++){
			if(y<i)
				probability += (1.0/(a*b));
		}

		return probability;
	}
}
