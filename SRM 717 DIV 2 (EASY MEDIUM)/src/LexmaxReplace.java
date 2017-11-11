import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LexmaxReplace {
	
	public String get(String s, String t) {
		char[] temp = t.toCharArray();
		char[] cards = t.toCharArray();
		Arrays.sort(temp);
		for(int i=0; i<cards.length; i++)
			cards[i] = temp[temp.length - 1 - i];


		int index = 0;
		String newWall = "";
		for(int i=0;i<s.length();i++){
			if(index<cards.length && s.charAt(i) < cards[index]){
				newWall+=cards[index];
				index++;
			}else{
				newWall+=s.charAt(i);
			}
		}

		return newWall;
	}
}
