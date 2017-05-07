import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TestTaking {
	
	public int findMax(int questions, int guessed, int actual) {
		int tru = actual;
		int fal = questions - actual;
		if(guessed > actual){
			return actual + (questions - guessed);
		}

		if(guessed < actual){
			return guessed + (questions-actual);
		}else
			return questions;
	}
}
