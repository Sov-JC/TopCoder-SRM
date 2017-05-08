import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Quacking {
	
	public int quack(String s) {
		int[] mem = new int[5];
		int[] mem2 = {'q','u','a','c','k'};
		int ducks = 0;
		for(int i=0; i<s.length(); i++) {
			for (int j = 0; j < mem2.length; j++) {
				if (s.charAt(i) == mem2[j])
					mem[j]++;
			}//for j

			if (mem[0] < mem[1] || mem[1] < mem[2] || mem[2] < mem[3] || mem[3] < mem[4])
				return -1;

			ducks = Math.max(ducks, mem[0]);

			if (mem[0] > 0 && mem[1] > 0 && mem[2] > 0 && mem[3] > 0 && mem[4] > 0) {
				for (int p = 0; p < mem.length; p++) {
					mem[p]--;
				}
			}

		}//for i

		for(int i=0; i<mem.length-1; i++){
			if(mem[i] != mem[i+1])
				return -1;
		}

		return ducks;
	}

}
