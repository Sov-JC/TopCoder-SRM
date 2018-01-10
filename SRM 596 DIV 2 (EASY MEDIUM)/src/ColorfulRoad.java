import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ColorfulRoad {

	public int getMin(String road){
		char[] color = {'R','G','B'};
		char[] r = road.toCharArray();
		int[] rlen = new int[road.length()]; //default init to zeros

		rlen[r.length-1] = 0;

		for(int i=r.length-2;i>=0;i--){
			char currColor = road.charAt(i);
			char nextColor;
			if(currColor == 'R')
				nextColor = 'G';
			else if(currColor == 'G')
				nextColor = 'B';
			else
				nextColor = 'R';

			for(int j=i+1;j<r.length;j++){
				int difference = j-i;
				int cost = difference*difference;
				if(r[j]==nextColor){
					if(rlen[j] != Integer.MAX_VALUE)//if there exists a road starting from j
						if(rlen[i]==0) {
							rlen[i] = rlen[j] + cost;
						}else if(rlen[i] > (rlen[j] + cost)){
							rlen[i] = rlen[j] + cost;
						}

				}
			}
			//if it was never updated (no path was found) then initialize to MAX_INT
			if(rlen[i] == 0)
				rlen[i] = Integer.MAX_VALUE;
		}
		return rlen[0] == Integer.MAX_VALUE ? -1 : rlen[0];
	}

}
