import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheKingsArmyDiv2 {
	
	public int getNumber(String[] state) {


		int happies = 2;
		boolean twoCloseHappies = false;
		for(int r=0; r<state.length; r++){
			for(int c=0; c<state[0].length(); c++){
				if(neighboringHappy(state, r, c))
					if(state[r].charAt(c) == 'H')
						return happies = 0;
					else
						happies = 1;
			}
		}

		return happies;
	}

	boolean neighboringHappy(String[] state, int r, int c){
		//top
		if(r>0)
			if(state[r-1].charAt(c) == 'H')
				return true;

		//bottom
		if((r<state.length-1))
			if(state[r+1].charAt(c) == 'H')
				return true;

		//right
		if(c<state[0].length()-1)
			if(state[r].charAt(c+1) == 'H')
				return true;

		//left
		if(c>0)
			if(state[r].charAt(c-1) == 'H')
				return true;

		return false;
	}
}
