import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Quorum {
	
	public int count(int[] arr, int k) {
		ArrayList<Integer> x = new ArrayList<>();
		for(int i=0; i<arr.length; i++)
			x.add(arr[i]);

		int total = 0;
		for(int i=0; i<k; i++){
			int minIndex = 0;
			for(int j=0; j<x.size(); j++){
				if(x.get(minIndex) > x.get(j))
					minIndex = j;
			}

			total += x.remove(minIndex);
		}
		return total;
	}
}
