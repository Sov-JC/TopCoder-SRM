import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndSightseeing {
	
	public int getMin(int[] position) {
		int sum ;
		int min = Integer.MAX_VALUE;
		for(int i=1; i<position.length-1;i++){
			sum=0;
			for(int j=1; j<position.length; j++){
				if(j==i){
					j++;
					sum+= Math.abs(position[j-2] - position[j]);
				}else {
					sum += Math.abs(position[j - 1] - position[j]);
				}
			}
			min = Math.min(min, sum);
		}
		return min;

	}
}
