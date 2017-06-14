import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LuckyXor {
	
	public int construct(int a) {
		for(int i=1; i<=100; i++){
			Integer val = a^i;
			char c = val.toString().charAt(0);
			if(!((c=='4')||(c=='7'))) {
				continue;
			}

			String valStr = val.toString();
			int valLen = valStr.length();
			for(int j=0; j<valLen; j++){
				if(valStr.charAt(j) == c)
					if(j==valLen-1)
						if(i>a)
							return i;
				else
					break;
			}
		}

		return -1;
	}
}
