import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRoad {
	
	public double findDistance(int[] start, int[] finish) {

		Arrays.sort(start); Arrays.sort(finish);

		int min = start[0];
		int max = finish[finish.length-1];
		int diff = max-min;



		return Math.sqrt(2) * diff;
	}
}
