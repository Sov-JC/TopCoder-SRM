import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DivideByZero {
	
	public int CountNumbers(int[] numbers) {

		Set<Integer> set = new HashSet<Integer>();

		for(Integer x: numbers)
			set.add(x);

		boolean done = false;

		while(!done){
			ArrayList<Integer> toAppend = new ArrayList<>();

			int originalSize = set.size();

			for(Integer x: set){
				for(Integer y: set){
					if(x>y )
						toAppend.add(x/y);
				}
			}

			for(Integer x: toAppend){
				set.add(x);
			}

			done = originalSize == set.size() ? true : false;
		}

		//for(int x: set)
		//	System.out.println(x + ", ");

		return set.size();
	}
}
