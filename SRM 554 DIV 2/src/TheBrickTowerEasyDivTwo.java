import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheBrickTowerEasyDivTwo {

	//submitted method
	public int find(int redCount, int redHeight, int blueCount, int blueHeight)
	{
		int rc = redCount, bc = blueCount, rh = redHeight, bh = blueHeight;
		HashSet<Integer> set = new HashSet<>();
		int currHeight;

		//consider starting with a BLUE
		int r;
		int b;
		for(b=1; b<=bc; b++){
			r = b-1;
			if(r<=rc) {
				currHeight = b*bh + r*rh;//b-1 REDS, b BLUES
				set.add(currHeight);
			}

			r = b;
			if(r<=rc){
				currHeight = b*bh + r*rh; // b REDS, b BLUES
				set.add(currHeight);
			}
		}

		//consider starting with a RED
		for(r=1; r<=rc; r++){
			b = r-1;
			if(b<=bc){
				currHeight = r*rh + b*bh; //r-1 BLUES, r REDS
				set.add(currHeight);
			}
			if(b<=bc){
				currHeight = r*rh + b*bh; //r BLUEs, r REDs
				set.add(currHeight);
			}
		}

		for(int x: set)	System.out.println(x+", ");

		return set.size();
	}

	//not submitted
	// -more efficient
	public int findTWO(int redCount, int redHeight, int blueCount, int blueHeight){
		int rc = redCount, bc = blueCount, rh = redHeight, bh = blueHeight;
		HashSet<Integer> set = new HashSet<>();
		int maxCount = Math.max(redCount, blueCount);

		int r, b;
		for(int i=1; i<=maxCount; i++){
			//STARTING WITH: RED
			r=i;
			b=r-1;
			if(r<=rc) {
				if (b <= bc)
					set.add(r*rh + b*bh);

				b = r;
				if (b <= bc)
					set.add(r*rh + b*bh);

			}

			//STARTING WITH: BLUE
			b=i;
			r=b-1;
			if(b<=bc) {
				if (r <= rc)
					set.add(r*rh + b*bh);

				r = b;
				if (r <= rc)
					set.add(r*rh + b*bh);
			}
		}

		for(int x: set)	System.out.println(x+", ");

		return set.size();
	}

}
