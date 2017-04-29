package SRM_711_DIV2;

import java.util.Arrays;

/**
 * Created by JORGE on 4/27/2017.
 * 1hr 45min 31sec
 */
public class SquareMaking {

    public int getMinimalPrice(int a, int b, int c, int d){
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int sum = 0;
        sum += arr[1] - arr[0];
        arr[0] = arr[1];
        sum+= arr[3] - arr[2];
        arr[3] = arr[2];

        int midPoint = ((arr[2]) + (arr[1])) / 2;
        sum += (2) * (midPoint-arr[0] + arr[3]-midPoint);

        return sum;
    }
}
