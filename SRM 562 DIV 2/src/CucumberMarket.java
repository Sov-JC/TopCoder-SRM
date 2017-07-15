import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CucumberMarket {
	
	public String check(int[] price, int budget, int k) {
		Arrays.sort(price);
		for(;k>0;k--)
			budget-=price[price.length-k];
		return budget < 0 ? "NO" : "YES";
	}
}
