import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndWord {
	
	public int howManyPairs(String[] words) {
		int count = 0;
		for(int i=0; i<words.length; i++){
			for(int ii=i; ii < words.length; ii++){
				if(ii!=i && words[i].length() == words[ii].length()){
					for(int p = 1; p<words[i].length(); p++) {
						String al = words[i].substring(0, p);
						String ar = words[i].substring(p,words[i].length());
						if(words[ii].endsWith(al) && words[ii].startsWith(ar)) {
							count++;
							break;
						}
					}
				}
			}
		}

		return count;
	}
}
