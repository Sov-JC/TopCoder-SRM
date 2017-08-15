import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SimpleGuess {
	
	public int getMaximum(int[] hints) {
		int max = 0;

		for(int x=1; x<=100; x++){
			for(int y=1; y<=100; y++){
				int found = 0;
				for(int i=0; i<hints.length; i++)
					if(((x+y) == hints[i]) || ((x-y) == hints[i]))
						found++;

				if(found >= 2)
					max = Math.max(max, x*y);
			}
		}

		return max;
	}
}
