import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CircleMarket {
	
	public int makePurchases(int[] openTime, int[] closeTime, int travelTime) {
		int maxClose = 0, totalPurchase = 0;
		int n = closeTime.length;
		for(int c: closeTime)
			maxClose = Math.max(maxClose, c);

		boolean[] purchased= new boolean[n];
		int totalTravelTime = 0;
		for(int i=0; totalTravelTime<=maxClose; i++){
			if(totalTravelTime >= openTime[i%n] && totalTravelTime <= closeTime[i%n]
					&& !purchased[i%n]) {
				purchased[i%n] = true;
				totalPurchase++;
			}

			totalTravelTime+=travelTime;
		}

		return totalPurchase;
	}
}
