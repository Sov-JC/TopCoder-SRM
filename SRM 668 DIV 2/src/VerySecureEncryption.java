import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class VerySecureEncryption {
	
	public String encrypt(String message, int[] key, int K) {
		char[] ans = new char[message.length()];

		while(K>0) {
			for (int i = 0; i < message.length(); i++)
				ans[key[i]] = message.charAt(i);

			String newMessage = "";
			for(char x: ans)
				newMessage+=x;
			message = newMessage;
			K--;
		}

		String strAns = "";

		for(char x: ans)
			strAns+=x;

		return strAns;
	}
}
