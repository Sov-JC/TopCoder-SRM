import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cross {
	
	public String exist(String[] board) {
		int cols = board[1].length();
		int rows = board.length;
		char[][] b = new char[rows][cols];

		char[] line = new char[cols];
		for(int i=0; i<rows; i++){
			line = board[i].toCharArray();
			for(int j=0; j<cols; j++){
				b[i][j] = line[j];
			}
		}

		/*
		System.out.println("Done generating b!!! it looks liek:");
		for(int i=0; i<rows; i++){
			for(int j=0 ;j<cols; j++){
				System.out.print(b[i][j]);
			}
			System.out.println("");
		}*/

		for(int i=1; i<rows-1; i++){
			for(int j=1; j<cols-1; j++){
				//System.out.println("I'm @ ["+i+"]["+j+"}");
				if(b[i][j] == '#' && b[i][j-1] == '#' && b[i][j+1] == '#' && b[i+1][j] == '#' && b[i-1][j] == '#')
					return "Exist";
			}
		}//row
		return "Does not exist";
	}
}
