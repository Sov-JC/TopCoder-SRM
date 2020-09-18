import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class StarsInTheSky {

	private int starsInRec(int[] X, int[] Y, int xl, int xr, int yb, int yt){
		int count = 0;

		for(int i=0; i<X.length; i++){
			int x = X[i];
			int y = Y[i];

			boolean inSquare = (x <= xr) && (x >= xl) && (y <= yt) && (y>= yb);

			if(inSquare)
				count++;
		}

		return count;
	}
	
	public int countPictures(int N, int[] X, int[] Y) {

		int count = 0;

		for(int i=1; i<=(int)Math.pow(2,N)-1; i++){
			String binStr = Integer.toBinaryString(i);

//			System.out.println("binStr before prepend: " + binStr);

			int missingPrependedZeros = N-binStr.length();

//			System.out.println("missingPrependedZeros: " + missingPrependedZeros);
			for(int x=0; x<missingPrependedZeros; x++){
				binStr = "0" + binStr;
			}
//
//			System.out.println("binStr after prepend: " + binStr);
//
//			System.out.println("binStr.length: " + binStr.length() + ", N: " + N);
			assert(binStr.length() == N);

			ArrayList<Integer> starIndexes = new ArrayList<>();

			for(int j=(binStr.length()-1); j>=0; j--){
				if(binStr.charAt(j) == '1') {
//					System.out.println("adding star at index: " + j);
					starIndexes.add(j);
				}
			}

			int leftMostX = Integer.MAX_VALUE;
			int rightMostX = Integer.MIN_VALUE;
			int topMostY = Integer.MIN_VALUE;
			int bottomMostY = Integer.MAX_VALUE;

//			System.out.println("Star indexes: " + starIndexes);

			for(int starIndex: starIndexes){
				leftMostX = Math.min(leftMostX, X[starIndex]);
				rightMostX = Math.max(rightMostX, X[starIndex]);
				topMostY = Math.max(topMostY, Y[starIndex]);
				bottomMostY = Math.min(bottomMostY, Y[starIndex]);
			}



//			System.out.println("lines (lx, ty, by, rx): " + leftMostX + " | " + topMostY + " | " + bottomMostY + " | " + rightMostX);

			int starsInRectangle = starsInRec(X, Y, leftMostX, rightMostX, bottomMostY, topMostY);

//			System.out.println("starsInRectangle: " + starsInRectangle);

			if(starsInRectangle == starIndexes.size()){
//				System.out.println("Hit!");



				count++;
			}

		}

		return count;
	}
}
