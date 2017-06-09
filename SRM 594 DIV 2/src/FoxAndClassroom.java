import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndClassroom {
	
	public String ableTo(int n, int m) {
		for(int r=0; r<n; r++){
			for(int c=0; c<m;c++){
				int currR = r;
				int currC = c;
				int count = 0;
				count++;
				currR = (currR+1)%n;
				currC = (currC+1)%m;
				while(true){
					if(currR == r && currC == c){
						if(count==n*m) return "Possible";
						break;
					}else{
						count++;
						currR = (currR+1)%n;
						currC = (currC+1)%m;
					}
				}
			}
		}

		return "Impossible";
	}
}
