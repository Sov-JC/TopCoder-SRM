import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TreeAndVertex {
	
	public int get(int[] tree) {
		int[] mem = new int[tree.length+1];
		for(int i=0; i<mem.length; i++)
			mem[i] = 0;

		for(int i=0; i<tree.length; i++){
			mem[tree[i]]++;
			mem[i+1]++;
		}

		int max = 1;
		for(int i=0; i<tree.length; i++){
			max = Math.max(max, mem[i]);
		}

		return max;
	}
}
