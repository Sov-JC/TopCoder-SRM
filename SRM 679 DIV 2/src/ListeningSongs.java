import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ListeningSongs {
	
	public int listen(int[] durations1, int[] durations2, int minutes, int T) {
		int seconds = minutes*60;
		int time = 0;
		int count = 0;

		Arrays.sort(durations1);
		Arrays.sort(durations2);

		for(int i=0; i<T; i++) {
			if(i>=durations1.length || i>=durations2.length)
				return -1;

			time += (durations1[i] + durations2[i]);
			durations1[i] = 0;
			durations2[i] = 0;
			count+=2;
		}

		if(time>seconds)
			return -1;

		int[] durations = new int[durations1.length+durations2.length];
		int dIndex = 0;

		for(int i=0; i<durations1.length; i++)
			durations[dIndex++] = durations1[i];

		for(int i=0; i<durations2.length; i++)
			durations[dIndex++] = durations2[i];

		Arrays.sort(durations);

		for(int i=0; i<durations.length && (time < seconds); i++) {
			if(time+durations[i] <= seconds) {
				time += durations[i];
				if(durations[i] != 0)
					count++;
			}
		}

		return count;
	}
}
