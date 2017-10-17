import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PikachuEasy {

	public String check(String word) {
		if(word.length() == 0)
			return "YES";
		if(word.length() == 1)
			return "NO";
		if(word.length() == 2)
			return word.equals("pi") || word.equals("ka") ? "YES" : "NO";
		if(word.length() == 3)
			return word.equals("chu") ? "YES" : "NO";

		String s = word.substring(0, 2);
		if(s.equals("pi") || s.equals("ka"))
			return check(word.substring(2, word.length()));

		s = word.substring(0, 3);
		if(s.equals("chu"))
			return check(word.substring(3, word.length()));

		return "NO";
	}


}

