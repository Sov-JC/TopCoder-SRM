import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BishopMove {
	
	public int howManyMoves(int r1, int c1, int r2, int c2) {

		int rowDiff = Math.abs(r1-r2);
		int colDiff = Math.abs(c1-c2);

		if(rowDiff%2==0 && colDiff%2==1 || rowDiff%2==1 && colDiff%2==0)
			return -1;
		else if(rowDiff==colDiff)
			if(rowDiff==0)
				return 0;
			else
				return 1;
		else
			return 2;
	}

}
