import java.util.*;
import java.math.*;
import static java.lang.Math.*;


public class TwiceString {


	ArrayList<String> overlappingStrings(String str){
		ArrayList<String> strs = new ArrayList<>();

		for(int i=0; i<str.length(); i++){
			String preStr = str.substring(0,i);
			String preRemaining = str.substring(i,str.length());

			String postStr = str.substring(str.length()-i,str.length());
			String postRemaining = str.substring(0,str.length()-i);

			if(postStr.equals(preStr)) {
				strs.add(postRemaining + preStr + preRemaining);
				System.out.println("[" + postRemaining+preStr+preRemaining+ "]" + " is overlap of [" + str + "]");
			}else{
				System.out.println("[" + postRemaining+preStr+preRemaining+ "]" + " is NOT overlap of [" + str + "]");
			}
		}

		return strs;
	}

	
	public String getShortest(String s) {
		String shortest = s + s;

		for(String str: overlappingStrings(s)){
			shortest = str.length() < shortest.length() ? str : shortest;
		}


		return shortest;
	}
}
