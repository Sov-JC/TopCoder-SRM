import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class XorBoardDivTwo {
	
	public int theMax(String[] board) {
		int n = board.length;
		int m = board[0].length();
		char[][] b = new char[n][m];
		int max = 0;

		for(int r=0; r<n; r++){
			for(int c=0; c<m; c++){
				int amt = 0;

				for(int i=0; i<board.length; i++)
					for(int j=0; j<board[0].length(); j++)
						b[i][j] = board[i].charAt(j);

				for(int i=0; i<n; i++){//xor a column
					b[i][c] = b[i][c] == '0' ? '1' : '0';
				}

				for(int j=0; j<m; j++){//xor a row
					b[r][j] = b[r][j] == '0' ? '1' : '0';
				}

				max = Math.max(max, ones(b));
			}
		}

		return max;
	}

	private static int ones(char[][] b){
		int count = 0;
		for(int i=0; i<b.length;i++)
			for(int j=0;j<b[0].length;j++)
				if(b[i][j] == '1')
					count++;

		return count;
	}
}
