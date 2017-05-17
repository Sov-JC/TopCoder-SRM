import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Initials {
	
	public String getInitials(String name) {
		String[] n = name.split(" ");
		String sum = "";
		for(int i=0; i<n.length; i++)
			sum+=(n[i].charAt(0));
		return sum;
	}
}
