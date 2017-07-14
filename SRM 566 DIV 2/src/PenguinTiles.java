import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PenguinTiles {
	
	public int minMoves(String[] tiles) {
		int moves = 0;
		int r =0, c= 0;

		for(int i=0; i<tiles.length; i++)
			for(int j=0; j<tiles[0].length(); j++)
				if(tiles[i].charAt(j) == '.') {
					r = i;
					c = j;
				}

		moves = r < tiles.length - 1 ? moves +1 : moves;
		moves = c < tiles[0].length() -1 ? moves + 1 : moves;

		return moves;
	}
}
