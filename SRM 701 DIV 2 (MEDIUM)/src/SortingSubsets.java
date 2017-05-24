import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SortingSubsets {
	
	public int getMinimalSize(int[] a) {

		int[] n = Arrays.copyOf(a, a.length); //original
		Arrays.sort(a);

		int changes = 0;

		for(int i=0; i<a.length; i++) //if their position OK, don't change!
			if(n[i] == a[i])
				n[i]*=(-1);

		for(int i=0; i< a.length; i++){
			boolean found = false;
			for(int j=0; j<n.length&&!found; j++)
				if(a[i]==n[j]) {
					n[j] *= (-1);
					changes = i==j ? changes : changes+1;
					found=true;
				}
		}

		return changes;
	}
}
