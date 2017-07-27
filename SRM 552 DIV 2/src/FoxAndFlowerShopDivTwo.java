import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndFlowerShopDivTwo {
	
	public int theMaxFlowers(String[] flowers, int r, int c) {
		int max = 0;
		int count = 0;
		for(int i=0; i<r; i++)//top
			for(int j=0; j<flowers[0].length(); j++)
				if(flowers[i].charAt(j) == 'F')
					count++;

		max = Math.max(max, count);
		count = 0;
		for(int i=r+1; i<flowers.length; i++)//bottom
			for(int j=0; j<flowers[0].length(); j++)
				if(flowers[i].charAt(j) == 'F')
					count++;

		max = Math.max(max, count);
		count = 0;
		for(int i=0; i<flowers.length; i++)//left
			for(int j=0; j<c; j++)
				if(flowers[i].charAt(j) == 'F')
					count++;

		max = Math.max(max, count);
		count = 0;
		for(int i=0; i<flowers.length; i++)//right
			for(int j=c+1; j<flowers[0].length(); j++)
				if(flowers[i].charAt(j) == 'F')
					count++;

		max = Math.max(max, count);

		return max;
	}

}
