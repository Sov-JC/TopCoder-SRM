import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Robofactory {
	
	public int reveal(int[] query, String[] answer) {
		if(query.length ==1)
			return 0;

		int evenCount=0;
		for(int i=1; i<query.length; i++){
			if(!correct(query[i], answer[i]))
				return i;

			if(answer[i-1] == "Even")
				evenCount++;
		}

		if(evenCount==0 && answer[0] == "Odd")
			return 0;

		return -1;
	}

	public boolean correct(int q, String ans){
		if(q%2==0 && ans == "Even")
			return true;
		else if(q%2!= 0 && ans == "Odd")
			return true;
		else
			return false;
	}
}
