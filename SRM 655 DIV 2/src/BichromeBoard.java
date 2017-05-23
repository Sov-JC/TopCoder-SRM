import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BichromeBoard {

	private boolean possible(char expected, String[] board){
		char curr;
		for(int i=0; i<board.length; i++) {
			if(i!=0 && (board[0].length())%2==0)
				expected = expected == 'W' ? 'B' : 'W';

			for (int j = 0; j < board[0].length(); j++) {
				curr = board[i].charAt(j);
				if (curr != '?' && curr != expected)
					return false;
				expected = expected == 'W' ? 'B' : 'W';
			}
		}

		return true;
	}
	
	public String ableToDraw(String[] board) {
		boolean WStart = possible('W', board);
		boolean BStart = possible('B', board);

		return WStart||BStart ? "Possible" : "Impossible";
	}
}
