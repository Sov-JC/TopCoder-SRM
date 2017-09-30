import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RectangleCoveringEasy {
	
	public int solve(int holeH, int holeW, int boardH, int boardW) {

		for(int i=0; i<2; i++) {
			int touchingSides = 0;
			int oks = 0;

			if(i==1){ //swap
				int temp = boardH;
				boardH = boardW;
				boardW = temp;
			}

			if (holeW <= boardW) {
				oks++;
				if (holeW == boardW)
					touchingSides++;
			}

			if (holeH <= boardH){
				oks++;
				if (holeH == boardH)
					touchingSides++;
			}

			if (oks == 2 && touchingSides <= 1)
				return 1;
		}

		return -1;


	}
}
