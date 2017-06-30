import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CandidatesSelectionEasy {
	
	public int[] sort(String[] score, int x)
	{
		int[] ans = new int[score.length];
		int pos = 0;
		for(int i=0; i<26; i++){
			for(int j=0; j<score.length; j++)
				if (score[j].charAt(x) == ('A'+i))
					ans[pos++] = j;
		}
		return ans;
	}
}
