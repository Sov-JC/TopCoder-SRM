import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PalindromizationDiv2 {
	
	public int getMinimumCost(int X) {
		int temp = X;
		int min = Integer.MAX_VALUE;
		for(; X >= 0; X--)
			if(isPalindrome(X)) {
				min = Math.min(min, Math.abs(temp-X));
				break;
			}

		X = temp;
		for(; X <= 100000; X++)
			if(isPalindrome(X)) {
				min = Math.min(min, Math.abs(temp-X));
				break;
			}

		return min;
	}

	boolean isPalindrome(Integer x){
		String s = x.toString();

		for(int i=0; i<s.length()-1; i++)
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;

		System.out.println(s + " Works.");
		return true;
	}
}
