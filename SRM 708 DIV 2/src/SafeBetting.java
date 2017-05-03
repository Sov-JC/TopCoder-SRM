import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SafeBetting {
	
	public int minRounds(int a, int b, int c) {

		int B = 0;

		while(b<c){
			b+=(b-a);
			B++;
		}

		return B;
	}
}
