import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TeamsSelection {
	
	public String simulate(int[] preference1, int[] preference2) {
		int n = preference1.length;
		boolean cOneTurn = true;
		char[] picks = new char[n];

		int i=0, j = 0;
		int boy;
		while(true){
			if(i==n && j ==n)
				break;
			else if(i==n)
				cOneTurn = false;
			else if(j==n)
				cOneTurn = true;

			if(cOneTurn){
				boy = preference1[i];
				if(picks[boy-1] == '\0') {
					picks[boy - 1] = '1';
					cOneTurn = false;
				}

				i++;
			}else{
				boy = preference2[j];
				if(picks[boy-1] == '\0'){
					picks[boy-1] = '2';
					cOneTurn = true;
				}

				j++;
			}
		}//while

		return new String(picks);
	}
}
