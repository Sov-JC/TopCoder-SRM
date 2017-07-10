import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BlackAndWhiteSolitaire {
	
	public int minimumTurns(String cardFront) {
		int count=0;
		char[] start = {'B', 'W'};
		int curr = 0;
		for(int i=0; i<cardFront.length(); i++){
			if(cardFront.charAt(i)!=start[curr]){
				count++;
			}
			curr = curr == 0 ? 1 : 0;
		}

		int temp = count;
		count = 0;
		curr = 1;
		for(int i=0; i<cardFront.length(); i++){
			if(cardFront.charAt(i)!=start[curr]){
				count++;
			}
			curr = curr == 0 ? 1 : 0;
		}
		return Math.min(temp, count);
	}
}
