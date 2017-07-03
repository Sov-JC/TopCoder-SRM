import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RaiseThisBarn {
	
	public int calc(String str) {

		String l, r;
		int lc = 0, rc = 0, ans = 0;
		for(int i=1; i<str.length(); i++){
			l = str.substring(0,i);
			r = str.substring(i, str.length());

			for(int j=0; j<l.length(); j++)
				if(l.charAt(j) == 'c')
					lc++;

			for(int j=0; j<r.length(); j++)
				if(r.charAt(j) == 'c')
					rc++;

			if(lc==rc)
				ans++;

			lc = rc = 0;
		}

		return ans;
	}
}
