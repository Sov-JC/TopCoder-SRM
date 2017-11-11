import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NiceTable {
	
	public String isNice(String[] t) {
		int n=32;//represents combination of 5

		for(int r=0;r<n; r++){
			for(int c=0;c<n;c++){
				//System.out.println("R:" + Integer.toBinaryString(r) + ", C:"+Integer.toBinaryString(c));
				boolean isNice = true;
				for(int i=0; i<t.length; i++){
					for(int j=0; j<t[0].length(); j++){

						int x = ((1<<i)&r)>>i;
						int y = ((1<<j)&c)>>j;

						char xXORy = ((x^y) == 0) ? '0' : '1';

						if(xXORy != t[i].charAt(j))
							isNice = false;

					}
				}

				if(isNice)
					return "Nice";
			}
		}
		return "Not nice";
	}



}
