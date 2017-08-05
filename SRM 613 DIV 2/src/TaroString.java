import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroString {

	//submitted
	public String getAnswer(String S) {
		int cc=0, ac=0, tc=0;
		for(int i=0;i<S.length();i++)
			if(S.charAt(i) == 'C')
				cc++;
			else if(S.charAt(i)=='A')
				ac++;
			else if(S.charAt(i)=='T')
				tc++;

		if(cc==1 && ac==1 && tc==1) {
			char[] expected = {'C','A','T'};
			int e = 0;
			int count = 0;
			for(int i=0; i<S.length() && e < 3; i++){
				if(S.charAt(i) == expected[e])
					e++;
			}

			return e == expected.length ? "Possible" : "Impossible";
		}else
			return "Impossible";

	}


	public String getAnswer2(String S){
		char[] expected = {'C','A','T'};

		int e =  0;

		for(int i=0; i<S.length(); i++){
			char c = S.charAt(i);
			if(c == 'C' || c == 'A' || c == 'T'){
				if(e==expected.length)
					return "Impossible";
				else{
					if(c != expected[e])
						return "Impossible";
					else
						e++;
				}
			}
		}

		return "Possible";
	}
}
