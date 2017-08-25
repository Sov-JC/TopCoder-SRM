import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EggCartons {
	
	public int minCartons(int n) {
		int min = Integer.MAX_VALUE;
		for(int eightC = 0; eightC<13; eightC++){
			for(int sixC=0; sixC<17; sixC++){
				if(eightC*8+sixC*6==n)
					min = Math.min(min, eightC+sixC);
			}
		}

		return min == Integer.MAX_VALUE ? -1: min;
	}

}
