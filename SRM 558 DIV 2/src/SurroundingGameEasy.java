import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SurroundingGameEasy {
	
	public int score(String[] cost, String[] benefit, String[] stone) {
		int score = 0;

		for (int i = 0; i < stone.length; i++) {
			for (int j = 0; j < stone[0].length(); j++) {
				int adj = 0;

				if(!validPos(i-1, j, stone)) //bottom
					adj++;
				else
					if(stone[i-1].charAt(j) == 'o')
						adj++;

				if(!validPos(i+1, j, stone)) //top
					adj++;
				else
					if(stone[i+1].charAt(j) == 'o')
						adj++;

				if(!validPos(i, j-1, stone)) //left
					adj++;
				else
					if(stone[i].charAt(j-1) == 'o')
						adj++;

				if(!validPos(i, j+1, stone)) //right
					adj++;
				else
					if(stone[i].charAt(j+1) == 'o')
						adj++;

				char current = stone[i].charAt(j);

				if(current == 'o'){
					score += Character.getNumericValue(benefit[i].charAt(j));
					score -= Character.getNumericValue(cost[i].charAt(j));
				}else if(adj == 4){
					score += Character.getNumericValue(benefit[i].charAt(j));
				}

			}
		}

		return score;
	}

	boolean validPos(int i, int j, String stone[]){
		if(i<0 || i>=stone.length)
			return false;
		if(j<0 || j>=stone[0].length())
			return false;

		return true;
	}

}
