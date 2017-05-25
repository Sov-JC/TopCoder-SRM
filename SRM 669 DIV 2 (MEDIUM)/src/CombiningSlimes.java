import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CombiningSlimes {
	
	public int maxMascots(int[] a) {
		Arrays.sort(a);
		int[] cpy = Arrays.copyOf(a,a.length);
		Arrays.sort(cpy);

		int mascots=0;
		for(int i=0; i<cpy.length-1; i++){
			mascots += (cpy[i] * cpy[cpy.length-1]);
			cpy[cpy.length-1]+=cpy[i];
		}

		return mascots;
	}
}
