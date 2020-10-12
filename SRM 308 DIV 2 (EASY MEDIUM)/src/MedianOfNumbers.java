import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MedianOfNumbers {
	
	public int findMedian(int[] numbers) {

		Arrays.sort(numbers);

		if(numbers.length %2 == 0)
			return -1;
		else
			return numbers[(numbers.length)/2];


	}
}
