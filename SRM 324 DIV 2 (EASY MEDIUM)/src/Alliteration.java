import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Alliteration {
	
	public int count(String[] words) {

		char lastLetter = Character.toLowerCase(words[0].charAt(0));
		int count = 0;

		int lastLetterCount = 1;

		for(int i=1; i<words.length; i++){

			char currLetter = Character.toLowerCase(words[i].charAt(0));

			if(currLetter == lastLetter){
				if(lastLetterCount==1)
					count++;
				lastLetterCount++;
			}else{
				lastLetter = currLetter;
				lastLetterCount = 1;
			}

		}

		return count;
	}
}
