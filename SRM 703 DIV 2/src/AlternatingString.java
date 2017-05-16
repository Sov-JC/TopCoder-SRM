import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AlternatingString {

	public int maxLength(String s) {
		char expected;
		int count = 1;
		int max = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			expected = alternative(s.charAt(i));
			if (s.charAt(i + 1) != expected)
				count = 1;
			else
				max = Math.max(max, ++count);
		}
		return max;
	}

	char alternative(char ch) {
		return ch == '0' ? '1' : '0';
	}
}
