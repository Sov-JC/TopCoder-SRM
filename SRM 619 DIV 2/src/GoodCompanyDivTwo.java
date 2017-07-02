import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GoodCompanyDivTwo {
	
	public int countGood(int[] superior, int[] workType) {
		ArrayList<Integer> aDepartment = new ArrayList<>();
		int ans = 0;
		for(int i=0; i<superior.length; i++){//for each employer
			aDepartment.add(i);
			for(int j=i; j<superior.length; j++)
				if (superior[j] == i)
					aDepartment.add(j);

			boolean isGood = true;
			for(int j=0; j<aDepartment.size(); j++){
				int x = workType[aDepartment.get(j)];
				for(int z=j+1; z<aDepartment.size(); z++)
					if(workType[aDepartment.get(z)] == x)
						isGood = false;
			}

			if(isGood)
				ans++;

			aDepartment.clear();
		}

		return ans;
	}
}
