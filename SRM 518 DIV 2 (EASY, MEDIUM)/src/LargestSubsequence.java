import java.util.*;
import java.math.*;
import static java.lang.Math.*;


public class LargestSubsequence {

	public int[] largestChar(String s, int i){
		if(s.length() == 0)
			return new int[]{(int)Character.MIN_VALUE, 0, 1};

		char largestChar = s.charAt(i);

		//find largest character
		for(char c: s.substring(i, s.length()).toCharArray()){
			if((int)c > (int)largestChar)
				largestChar = c;
		}

		//find occurrences
		int lastLoc = i;
		int occurrences = 0;
		for(; i<s.toCharArray().length; i++){
			char c = s.charAt(i);
			if(c==largestChar){
				occurrences++;
				lastLoc=i;
			}
		}

		int largestLetterInt = largestChar;
		return new int[]{largestLetterInt, lastLoc, occurrences};
	}
	
	public String getLargest(String s) {
		String largestSubseq = "";

		for(int i=0; i<s.length();){
			int[] largestCharPair = largestChar(s, i);
			int largestChar = (char)largestCharPair[0];
			int lastLoc = largestCharPair[1];
			int occurrences = largestCharPair[2];

			for(int j=0; j<occurrences; j++) largestSubseq += (char)largestChar;

			i=lastLoc+1;
		}

		return largestSubseq;
	}
}
