import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SemiPerfectSquare {
	
	public String check(int N) {

		for(int b = 2; b<=Math.sqrt((double)N); b++){
				for(int a = 1; a<b; a++){
					if(a*b*b == N)
						return "Yes";
				}
		}
		return "No";
	}
}
