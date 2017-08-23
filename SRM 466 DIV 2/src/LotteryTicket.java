import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LotteryTicket {
	//Submitted
	public String buy(int price, int b1, int b2, int b3, int b4) {
		int[] bnotes = new int[]{b1, b2, b3, b4};
		int N = 4;

		if(b1==price || b2==price || b3==price || b4== price)
			return "POSSIBLE";
		if(b1+b2+b3+b4==price)
			return "POSSIBLE";

		for(int a=0; a<N; a++){
			for(int b=0; b<N && b!=a; b++){
				if(bnotes[a]+bnotes[b]==price)
					return "POSSIBLE";
			}
		}

		for(int a=0; a<N; a++){
			for(int b=0; b<N && b!= a; b++){
				for(int c=0; c<N && c != b && c!= a; c++){
					if(bnotes[a]+bnotes[b]+bnotes[c]==price)
						return "POSSIBLE";
				}
			}
		}

		return "IMPOSSIBLE";
	}

}
