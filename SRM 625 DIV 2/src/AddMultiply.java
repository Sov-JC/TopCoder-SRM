import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AddMultiply {
	
	public int[] makeExpression(int y) {
		ArrayList<Integer> x = new ArrayList<>();

		for(int i=-500; i<=500; i++){
			for(int j=-500; j<=500; j++){
				if(i*j < y && i != 0 && i!= 1 && j != 0 && j!=1){
					int temp = y-i*j;
					if( temp != 0 && temp!= 1 && temp < 500 && temp > -500) {
						System.out.println("Solution: " + i + "," + j + "," + temp);
						return new int[]{i, j, temp};
					}
				}
			}
		}

		return null;//NR
	}
}
