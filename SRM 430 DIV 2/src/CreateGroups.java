import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CreateGroups {

	public int minChanges(int[] groups, int minSize, int maxSize) {


		int overs=0, missing=0, total=0;

		int ans = 0;

		for(int g: groups) {
			total+=g;
			if (g > maxSize)
				overs += (g - maxSize);
			else if (g < minSize)
				missing += (minSize - g);
		}

		if(total<minSize*groups.length || total > maxSize*groups.length)
			return -1;

		if(missing==overs)
			ans = missing;
		else if(overs>missing){
			ans+=missing;
			overs = overs-missing;
			missing = 0;
			ans+=overs;
		}else{
			ans+=(overs);
			missing-=overs;
			ans+=missing;
			missing = 0;
		}

		return ans;
	}

}
