import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TriangleMaking {
	
	public int maxPerimeter(int a, int b, int c) {

		int arr[] = {a,b,c};
		Arrays.sort(arr);

		while(arr[2] >= (arr[1] + arr[0]))
			arr[2]--;

		return arr[0]+arr[1]+arr[2];
	}
}
