import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheSwapsDivTwo {
	
	public int find(int[] sequence) {
		Set<ArrayList<Integer>> set = new HashSet<>();
		for(int i=0; i<sequence.length; i++){
			for(int j=i+1; j<sequence.length; j++){
				ArrayList<Integer> al = new ArrayList<>();
				swap(i, j, sequence);

				for(Integer x: sequence)
					al.add(x);

				set.add(al);
				swap(i, j, sequence);
			}
		}

		return set.size();
	}

	private static void swap(int x, int y, int[] seq){
		int temp = seq[x];
		seq[x] = seq[y];
		seq[y] = temp;
	}

}
