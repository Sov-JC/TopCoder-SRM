import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FauxPalindromes {
	
	public String classifyIt(String word) {
		if(isPalindrome(word))
			return "PALINDROME";
		else if(isFaux(word))
			return "FAUX";

		return "NOT EVEN FAUX";
	}

	private boolean isPalindrome(String word){
		for(int i=0; i<word.length()/2; i++){
			if(word.charAt(i) != word.charAt(word.length()-1-i))
				return false;
		}
		return true;
	}

	private boolean isFaux(String word){
		char c = word.charAt(0);
		StringBuffer s = new StringBuffer();
		s.append(c);

		for(int i=1; i<word.length(); i++)
			if(word.charAt(i) != c) {
				c = word.charAt(i);
				s.append(c);
			}

		return isPalindrome(s.toString());
	}

}
