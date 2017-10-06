import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class InsertZ {
	
	public String canTransform(String init, String goal) {
		StringBuffer s = new StringBuffer();

		for(char x: goal.toCharArray())
			if(x!='z')
				s.append(x);

		String str = s.toString();


		return init.equals(str) ? "Yes" : "No";
	}
}
