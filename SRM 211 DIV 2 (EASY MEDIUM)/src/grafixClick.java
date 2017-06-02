import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class grafixClick {
	
	public int[] checkSaveButton(int[] mouseRows, int[] mouseCols) {
		ArrayList<Integer> mclk = new ArrayList<Integer>();


		for(int i=0; i<mouseRows.length; i++){
			if(mouseRows[i] < 20 ||
					mouseRows[i] > 39 ||
					mouseCols[i] < 50 ||
					mouseCols[i] > 99)
				continue;
			mclk.add(i);
		}

		int[] ans = new int[mclk.size()];
		for(int i=0; i<mclk.size(); i++)
			ans[i] = mclk.get(i);

		return ans;
	}
}
