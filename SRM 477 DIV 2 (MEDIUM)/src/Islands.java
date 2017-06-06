import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Islands {
	
	public int beachLength(String[] kingdom) {
		int length=0;
		for(int r=0; r<kingdom.length; r++){
			for(int c=0; c<kingdom[0].length();c++){
				char curr = kingdom[r].charAt(c);

				if(r%2==0){//EVEN ROW
					if(r-1 >= 0)//top-right
						if(kingdom[r-1].charAt(c) != curr)
							length++;
					if(r+1<kingdom.length)//bottom-right
						if(kingdom[r+1].charAt(c) != curr)
							length++;
				}else{//ODD ROW
					if(r-1 >= 0)//top-right
						if(c+1<kingdom[0].length())
							if(kingdom[r-1].charAt(c+1) != curr)
								length++;
					if(c+1 < kingdom[0].length() && r+1 < kingdom.length)//bottom-right
						if(kingdom[r+1].charAt(c+1) != curr)
							length++;
				}
				if(c+1<kingdom[0].length())//right
					if(kingdom[r].charAt(c+1) != curr)
						length++;
			}
		}

		return length;
	}
}
