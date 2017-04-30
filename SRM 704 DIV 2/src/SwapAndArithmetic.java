import java.util.Arrays;

public class SwapAndArithmetic {
	
	public String able(int[] x) {
		int[] temp = Arrays.copyOf(x, x.length);
		Arrays.sort(temp);

		int d = temp[1]-temp[0];
		for(int i=0; i<temp.length-1; i++)
			if(temp[i+1] != d + temp[i])
				return "Impossible";

		return "Possible";
	}
}
