import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TwoWaysSorting {
	
	public String sortingMethod(String[] stringList) {
		String[] lexi = Arrays.copyOf(stringList, stringList.length);;
		Arrays.sort(lexi);

		boolean isLexi = true;
		boolean isLeng = true;
		for(int i=0; i<lexi.length; i++){
			if(!lexi[i].equals(stringList[i]))
				isLexi = false;
			if(i>=1)
				if(stringList[i].length() < stringList[i-1].length())
					isLeng = false;
		}

		if(isLexi && isLeng)
			return "both";
		if(isLexi && !isLeng)
			return "lexicographically";
		if(!isLexi && isLeng)
			return "lengths";
		else
			return "none";
	}
}
