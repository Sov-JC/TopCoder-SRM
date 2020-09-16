import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RobotHerbDiv2 {
	
	public int getdist(int T, int[] a) {

		final int U=0, R=1, D=2, L=3;

		int direction[] = {U,R,D,L};

		int facing = U;

		int x=0, y=0;
		for(int i=0; i<T; i++) {
			for (int dist : a) {
				switch(facing){
					case U:
						y+=dist;
						break;
					case R:
						x+=dist;
						break;
					case D:
						y-=dist;
						break;
					case L:
						x-=dist;
						break;
				}
				facing = direction[(facing+dist)%4];
			}
		}//times

		return Math.abs(x)+Math.abs(y);
	}
}
