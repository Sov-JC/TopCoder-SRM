import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BracketExpressions {
	
	public String ifPossible(String expression) {

		final int MAX_X_COUNT = 5;
		for(String x: getXCombination(MAX_X_COUNT)){
			StringBuffer expReplaced = new StringBuffer();

			int index = 0;//for traversing x
			for(int i=0;i<expression.length(); i++){
				if(expression.charAt(i) == 'X') {
					expReplaced.append(x.charAt(index));
					index++;
				}else {
					expReplaced.append(expression.charAt(i));
				}
			}

			String exp = expReplaced.toString();
			if(isPossible(expReplaced.toString())) {
				return "possible";
			}
		}//outer for

		return "impossible";
	}

	private static boolean isPossible(String expression){
		Stack<Character> stack = new Stack<>();
		for(char c: expression.toCharArray()) {
			if( (c==')' || c== ']' || c== '}') && stack.isEmpty()) {
				return false;
			}

			if (c == ')'){
				if (stack.peek() != '(')
					return false;
				stack.pop();
			}else if(c==']') {
				if (stack.peek() != '[')
					return false;
				stack.pop();
			}else if(c=='}') {
				if (stack.peek() != '{')
					return false;
				stack.pop();
			}else{
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}

	private static ArrayList<String> getXCombination(int length){
		char[] prefix = {'(',')','[',']','{','}'};
		ArrayList<String> combinations = new ArrayList<>();
		if(length==0)
			return new ArrayList<String>(); //empty
		if(length==1) {
			for(char c: prefix)
				combinations.add(c+"");
			return combinations;
		}

		ArrayList<String> smaller = getXCombination(length-1);

		for(char c: prefix)
			for(String x: smaller)
				combinations.add(c+x);


		return combinations;
	}
}
