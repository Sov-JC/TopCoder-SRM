import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheShuttles {
	public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
		int leastCost = Integer.MAX_VALUE;

		int maxCnt = 1;
		for(int i=0; i<cnt.length; i++)
			maxCnt = Math.max(maxCnt, cnt[i]);

		for(int seats=1; seats<=maxCnt; seats++){
			int ShuttlesNeeded = 0;
			for(int i=0; i<cnt.length; i++)
				ShuttlesNeeded += (int)Math.ceil((double)cnt[i]/(double)seats);

			leastCost = Math.min(leastCost, ShuttlesNeeded*(baseCost + seats*seatCost));
		}

		return leastCost;
	}
}
