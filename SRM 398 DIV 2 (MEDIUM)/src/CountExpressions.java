import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CountExpressions {

	public int calcExpressions(int x, int y, int val) {
		ArrayList<Integer[]> nums = new ArrayList<>();

		int[] var = {x, y};

		for(int v=0; v<2;v++){
			for(int vv=0; vv<2;vv++){
				for(int vvv=0; vvv<2;vvv++){
					for(int vvvv=0; vvvv<2;vvvv++){
						int xcount=0;
						int ycount=0;

						if(var[v] == x)    xcount++; else ycount++;
						if(var[vv] == x)   xcount++; else ycount++;
						if(var[vvv] == x)  xcount++; else ycount++;
						if(var[vvvv] == x) xcount++; else ycount++;

						if(xcount > 2 || ycount > 2)
							continue;

						Integer[] valOnly = new Integer[4];//one for each variable
						valOnly[0] = var[v];
						valOnly[1] = var[vv];
						valOnly[2] = var[vvv];
						valOnly[3] = var[vvvv];

						nums.add(valOnly);
					}
				}
			}
		}

		char[] opp = {'*', '+', '-'};

		ArrayList<Character[]> opps = new ArrayList<>();
		for(int o=0; o<3; o++){
			for(int oo=0; oo<3; oo++){
				for(int ooo=0; ooo<3; ooo++){
					Character[] oppsOnly = new Character[3];
					oppsOnly[0] = opp[o];
					oppsOnly[1] = opp[oo];
					oppsOnly[2] = opp[ooo];
					opps.add(oppsOnly);
				}
			}
		}

		int count = 0;
		for(Integer[] ints: nums)
			for(Character[] chars: opps)
				if(valid(ints, chars, val))
					count++;

		return count;
	}

	private boolean valid(Integer[] nums, Character[] opps, int val){
		int cumm = calculate(nums[0], nums[1], opps[0]);
		for(int i=2; i<nums.length; i++){
			cumm = calculate(cumm, nums[i], opps[i-1]);
		}

		return cumm == val;//test
	}

	private int calculate(Integer intOne, Integer intTwo, Character opp){
		if(opp.equals('*'))
			return intOne * intTwo;
		return opp.equals('+') ? (intOne + intTwo): intOne - intTwo;
	}
}
