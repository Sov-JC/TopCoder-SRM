import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PointDistance {
	
	public int[] findPoint(int x1, int y1, int x2, int y2) {
		ArrayList<int[]> locs = new ArrayList<>();
		for(int i=-100; i<=100; i++){
			for(int j=-100;j<=100; j++){
				if(x1==i && y1 == j ||  x2==i && y2 ==j)
					continue;

				double ac = Math.sqrt(Math.pow(Math.abs(x1-i), 2) + Math.pow(Math.abs(y1-j), 2));
				double bc = Math.sqrt(Math.pow(Math.abs(x2-i), 2) + Math.pow(Math.abs(y2-j), 2));

				if(ac > bc ) {
					return new int[]{i, j};
				}
			}
		}

		return null;
	}
}
