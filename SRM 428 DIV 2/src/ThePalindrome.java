import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThePalindrome {
	public int find(String s){
		int n=s.length();
		String str;
		int min=n*2-1;

		for(int i=2*n-1;i>=n; i--){//a string of size i
			boolean isPalindrome = true;
			for(int j=0; j<n; j++){//index of the string of size i
				if( ((i-j)<n)&& (s.charAt(j) != s.charAt(i-1-j)) )
					isPalindrome = false;
			}

			if(isPalindrome)
				min = Math.min(min, i);
		}

		return min;
	}
}
