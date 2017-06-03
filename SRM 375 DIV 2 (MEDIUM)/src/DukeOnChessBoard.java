import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DukeOnChessBoard {
	
	public String dukePath(int n, String initPosition) {
		StringBuffer path = new StringBuffer().append(initPosition);

		ArrayList<String> visited = new ArrayList<>();
		visited.add(initPosition);

		char letter;
		int number;
		boolean canMove = true;

		while(canMove) {
			canMove = false;

			//System.out.println(path.toString());
			path.append('-');

			letter = initPosition.charAt(0);
			number = Integer.parseInt(initPosition.charAt(1) + "");

			char leftLetter = (char) (letter - 1);
			char rightLetter = (char) (letter + 1);
			int down = number - 1;
			int up = number + 1;

			//String coridnates
			String leftPos = leftLetter + "" + number;
			String rightPos = rightLetter + "" + number;
			String downPos = letter + "" + down;
			String upPos = letter + "" + up;

			if (validPosition(n, rightLetter, number) && !visited.contains(rightPos)) {//right
				path.append(rightPos);
				visited.add(rightPos);
				initPosition = rightPos;
				canMove = true;
			} else if (validPosition(n, letter, up) && !visited.contains(upPos)) { //up
				path.append(upPos);
				visited.add(upPos);
				initPosition = upPos;
				canMove = true;
			} else if (validPosition(n, letter, down) && !visited.contains(downPos)) {//down
				path.append(downPos);
				visited.add(downPos);
				initPosition = downPos;
				canMove = true;
			} else if (validPosition(n, leftLetter, number) && !visited.contains(leftPos)) {//left
				path.append(leftPos);
				visited.add(leftPos);
				initPosition = leftPos;
				canMove = true;
			}

		}//while

		String ans = path.toString();
		ans = ans.substring(0,ans.length()-1);//remove final -

		if(ans.length()>= 40){
			String firstTwenty = ans.substring(0, 20);
			String lastTwenty = ans.substring(ans.length()-20, ans.length());
			ans = firstTwenty + "..." + lastTwenty;
		}

		return ans;
	}

	private static Boolean validPosition(int n, char letter, int number){
		if(letter < 'a' || letter > ('a' + n-1) || number < 1 || number > n)
			return false;
		return true;
	}


}
