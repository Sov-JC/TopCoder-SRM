import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ContestWinner {
	
	public int getWinner(int[] events) {

		HashSet<Integer> candidates = new HashSet<>();
		for(int x: events)
			candidates.add(x);

		int best = events[0];
		int bestOccurrences = 1;
		int bestLastLoc = lastLoc(events[0], events);

		for(int x: candidates){
			int count = occurrences(x, events);
			if(count > bestOccurrences){
				best = x;
				bestOccurrences = count;
				bestLastLoc = lastLoc(x, events);
			}else if(count == bestOccurrences){
				int ll = lastLoc(x, events);
				if(ll < bestLastLoc){
					best = x;
					bestLastLoc = ll;
				}
			}
		}

		return best;
	}

	private static int lastLoc(int x, int events[]){
		for(int i=events.length-1; i>=0; i--)
			if(events[i]==x)
				return i;

		return -1;
	}

	private static int occurrences(int x, int events[]){
		int count = 0;
		for(int i=0; i<events.length; i++)
			count += events[i] == x ? 1 : 0;

		return count;
	}

}
