import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SuperUserDo {

	public int install(int[] A, int[] B) {
		Set<Integer> progs = new HashSet<>();

		for(int i=0; i<A.length; i++){
			for(int j=A[i]; j<=B[i]; j++){
				progs.add(new Integer(j));
			}
		}

		int total = 0;
		for(Integer x: progs)
			total++;

		return total;
	}
}
