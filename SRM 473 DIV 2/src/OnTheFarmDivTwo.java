import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class OnTheFarmDivTwo {
	
	public int[] animals(int heads, int legs) {
		for(int cowH=0; cowH<=heads; cowH++){
			int chickenH = heads-cowH;
			if((chickenH*2+cowH*4) == (legs))
				return new int[]{chickenH, cowH};
		}

		return new int[]{};
	}
}
