import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NetworkXZeroOne {

	//Submitted
	public String reconstruct2(String message) {
		StringBuffer m = new StringBuffer();

		char[] c = {'x', 'o'};
		int cIndex = 0;

		for(int times = 0; times < 2; times++) {
			cIndex = times == 0 ? 0 : 1;

			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) == '?')
					m.append(c[cIndex]);
				else
					m.append(message.charAt(i));
				cIndex = (cIndex + 1) % 2;
			}


			if (isValid(m.toString()))
				return m.toString();

			m.delete(0, m.length());
		}

		return message;
	}

	private boolean isValid(String message){
		for(int i=0; i<message.length()-1; i++)
			if(message.charAt(i) == message.charAt(i+1))
				return false;

		return true;
	}

	//Not submitted - Different Approach #1
	public String reconstruct(String message) {
		StringBuffer m = new StringBuffer();

		int firstLoc = -1;

		for (int i=0; i < message.length() || firstLoc < 0; i++)
				if(message.charAt(i) != '?')
					firstLoc = i;

		char c;
		if(firstLoc%2==0)
			c = message.charAt(firstLoc) == 'o' ? 'o' : 'x';
		else
			c = message.charAt(firstLoc) == 'o' ? 'x' : 'o';


		for(int i=0; i<message.length(); i++){
			m.append(c);
			c = (c == 'o' ? 'x' : 'o');
		}

		return m.toString();
	}


}
