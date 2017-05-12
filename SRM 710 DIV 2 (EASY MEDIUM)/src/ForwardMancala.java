import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ForwardMancala {
	
	public int[] findMoves(int[] start) {
		ArrayList<Integer> moves = new ArrayList<Integer>();

		int zeroCounter = 0;
		int totalStones = 0;
		for(int i=0; i<start.length; i++) {
			if(start[i] == 0)
				zeroCounter++;
			totalStones += start[i];
		}

		int empty[] = {};
		if(zeroCounter>=start.length-1)
			return empty;


		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		int maxIndex = -2;

		do{
			minIndex = -1;
			minValue = Integer.MAX_VALUE;
			maxValue = Integer.MIN_VALUE;
			maxIndex = -2;

			for(int i=0; i<start.length; i++){
				if(start[i] < minValue && start[i]!=0){
					minIndex = i;
					minValue = start[i];
				}
				if(start[i] > maxValue){
					maxIndex=i;
					maxValue=start[i];
				}
			}

			//pickup phase
			int j = (minIndex);
			start[j] = 0;
			moves.add(j);

			//dropping-of-stones phase
			while (minValue > 0) {
				j = (j+1)%start.length;
				start[j]++;
				minValue--;
				moves.add(j);
			}
		}while(maxValue!=totalStones);

		//convert moves to int[]
		int ans[] = new int[moves.size()];
		int index = 0;
		for(Integer x: moves) {
			ans[index++] = x;
		}
		return ans;
	}
}
