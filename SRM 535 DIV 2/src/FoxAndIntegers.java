import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndIntegers {
	
	public int[] get(int AminusB, int BminusC, int AplusB, int BplusC) {
		for(int a = (-30); a<=30; a++)
			for(int b = (-30); b<=30; b++)
				for(int c = (-30); c<=30; c++)
					if(a-b == AminusB && b-c == BminusC && a+b==AplusB && BplusC == b+c)
						return new int[]{a, b, c};
		return new int[]{};
	}
}
