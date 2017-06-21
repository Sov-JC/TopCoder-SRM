import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cdgame {
	
	public int rescount(int[] a, int[] b) {
		HashSet<Integer> h = new HashSet<>();

		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				int sumA=0;
				int sumB=0;
				int aTemp = a[i];
				int bTemp = b[j];
				a[i] = bTemp;
				b[j] = aTemp;

				for(int x=0; x<a.length; x++){
					sumA+=a[x];
					sumB+=b[x];
				}

				h.add(new Integer(sumA*sumB));

				a[i] = aTemp;
				b[j] = bTemp;
			}
		}

		return h.size();
	}
}
