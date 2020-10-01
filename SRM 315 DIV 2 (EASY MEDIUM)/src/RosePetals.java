import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RosePetals {
	
	public int getScore(int[] dice) {
		int counter=0;
		for(int d: dice)
			if(d==3)
				counter+=2;
			else if(d==5)
				counter+=4;

		return counter;
	}
}
