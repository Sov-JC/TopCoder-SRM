import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BallAndHats {
	public int getHat(String hats, int numSwaps) {
		int loc = 0;
		for (char c : hats.toCharArray())
			if(c=='o')
				break;
			else
				loc++;

		if(numSwaps==0)
			return loc;

		if(numSwaps%2==1)
			return loc == 1 ? 0 : 1;
		else
			return loc == 1 ? 1 : 0;
	}
}
