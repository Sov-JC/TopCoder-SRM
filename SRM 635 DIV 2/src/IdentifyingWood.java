import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class IdentifyingWood {
	public String check(String s, String t) {
		int tIndex = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == t.charAt(tIndex))
				tIndex++;
			if(tIndex == t.length())
				return "Yep, it's wood.";
		}
		System.out.println("tIndex is: " + tIndex);
		return "Nope.";
	}
}
