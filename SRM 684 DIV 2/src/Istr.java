import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Istr {
	
	public int count(String s, int k) {
		int[] ic = new int[26];

		int ans = 0;
		for(int i=0; i<s.length(); i++)
			ic[s.charAt(i)-'a']++;

		Arrays.sort(ic);

		for(;k > 0; k--) {
			ic[25]--;
			Arrays.sort(ic);
		}

		for(int x: ic)
			ans+=(x*x);

		return ans;
	}
}
