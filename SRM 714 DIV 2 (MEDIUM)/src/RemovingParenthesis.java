import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RemovingParenthesis {

	public int countWays(String s) {
		if(s.length() == 0)
			return 1;

		ArrayList<String> possible = new ArrayList<>();

		String removed;
		String left;
		String right;

		for(int i=1; i<s.length(); i++) {
			left = s.substring(1, i);
			right = s.substring((i + 1), s.length());
			removed = left + right;
			if(isCorrect(removed)) {
				possible.add(removed);
			}
		}

		int count = 0;
		for(String str: possible)
			count+=countWays(str);

		return count;
	}

	boolean isCorrect(String s){
		int prog = 0;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '(')
				prog++;
			else
				prog--;
			if (prog < 0)
				return false;
		}

		return prog == 0 ? true : false;
	}
}
