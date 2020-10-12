import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class HuffmanDecoding {
	
	public String decode(String archive, String[] dictionary) {

		String decoded = "";
		while(archive.length() != 0) {
			for (int r = 1; r <= archive.length(); r++) {
				String substr = archive.substring(0,r);

				for(int i=0; i<dictionary.length; i++){
					if(substr.equals(dictionary[i])){
						decoded += Character.toString((char)('A' + i));
						archive = archive.substring(r,archive.length());
					}
				}
			}
		}

		return decoded;

	}
}
