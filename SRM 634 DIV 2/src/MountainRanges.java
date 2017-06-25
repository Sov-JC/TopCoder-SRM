import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRanges {
	
	public int countPeaks(int[] heights) {
		if(heights.length == 1)
			return 1;
		int ans = 0;
		for(int i=1; i<heights.length-1; i++){
			if((heights[i-1] < heights[i]) && (heights[i+1] < heights[i]))
				ans++;
		}

		if(heights[0] > heights[1])
			ans++;

		if(heights[heights.length-1] > heights[heights.length-1-1])
			ans++;

		return ans;
	}
}
