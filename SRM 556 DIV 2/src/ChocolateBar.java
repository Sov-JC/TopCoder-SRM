import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ChocolateBar {
	
	public int maxLength(String letters) {
		int max = 1;
		for(int i=0; i<letters.length(); i++){
			for(int j = letters.length()-1; j>=i; j--){
				String s = letters.substring(i, j+1);
				System.out.println("Checking: " + s);
				if(isUnique(s))
					max = s.length() > max ? s.length() : max;
			}
		}
		return max;
	}

	boolean isUnique(String letters){
		int[] lOccur = new int[26];
		for(char x: letters.toCharArray())
			lOccur[x-'a']++;
		for(int x:lOccur)
			if(x>1)
				return false;

		return true;
	}
}
