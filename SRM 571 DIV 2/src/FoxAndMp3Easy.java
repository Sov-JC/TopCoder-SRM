import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndMp3Easy {
	
	public String[] playList(int n) {
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
			arr[i]=(""+(i+1)+"");

		sort(arr);

		if(n>50){
			String arrFifty[] = new String[50];
			for (int i = 0; i < 50; i++)
				arrFifty[i] = arr[i];

			return arrFifty;
		}
		return arr;
	}


	private static void sort(String[] arr){
		for(int i=arr.length-1;i>0;i--){
			int li=i; //index with least "largest" value in lexi sorted array
			for(int j=i-1; j>=0;j--){
				if(arr[li].compareTo(arr[j]) < 0) {
					//System.out.println("i is: " + i + ", j is: " + j);
					li = j;
				}
			}

			//swap
			String temp = arr[i];
			arr[i] = (arr[li]);
			arr[li] = temp;

			arr[i]+=".mp3";
		}

		arr[0] = arr[0]+".mp3";
	}
}
