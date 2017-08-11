import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ANDEquation {
	//submitted
	public int restoreY(int[] A) {
		if(A.length==2)
			return A[0] == A[1] ? A[0] : -1;

		for(int i=0; i<A.length; i++){
			int cumm = i==0 ? A[1] : A[0];

			for(int j=0; j<A.length; j++){
				if(j==i)
					continue;

				cumm = cumm & A[j];
			}

			if(cumm == A[i])
				return cumm;
		}

		return -1;
	}

	//not submitted - general case (works for few given test cases)
	public int restoreY2(int[] A){
		for(int i=0; i<A.length; i++){
			int cumm = Integer.MAX_VALUE;

			for(int j=0; j<A.length; j++)
				cumm = j==i ? cumm : (cumm & A[j]);

			if(cumm == A[i])
				return cumm;
		}

		return -1;
	}


}
