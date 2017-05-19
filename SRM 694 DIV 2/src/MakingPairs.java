import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MakingPairs {
	
	public int get(int[] card) {
		int sum = 0;
		for(int i=0; i<card.length; sum+=card[i++]/2);
		return sum;
	}
}
