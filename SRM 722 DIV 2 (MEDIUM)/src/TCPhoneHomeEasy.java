import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TCPhoneHomeEasy {
	
	public int validNumbers(int digits, String[] specialPrefixes) {
		int total=10;
		for(int i=1; i<digits;i++)
			total*=10;

		for(String x: specialPrefixes) {
			int diff = digits-x.length();

			int unusable=1;
			for(int i=0;i<diff;i++)
				unusable*=10;

			total-=unusable;
		}

		return total;
	}
}
