import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TriangleEasy {
	
	public int find(int n, int[] x, int[] y) {
		Set<Integer> set = new HashSet<>();
		for(int e: x)
			set.add(e);
		for(int e: y)
			set.add(e);

		if(x.length == 0)
			return 3;

		int add = 2;

		for(int e: set){
			ArrayList<Integer> eConnTo = new ArrayList<>();
			for(int i=0; i<x.length; i++)//add all vertices connected to E to eConnTo list
				if(e == x[i] || e==y[i])
					eConnTo.add(x[i] == e ? y[i] : x[i]);

			//check if vertices connected to E connect to each other, if so then you have a triangle
			for(int i=0; i<x.length; i++)
				if(eConnTo.contains(x[i]) && eConnTo.contains(y[i]))
					return 0;

			if(eConnTo.size() > 1)
				add = 1;
		}

		return add;
	}
}
