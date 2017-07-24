import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PlatypusDuckAndBeaver {
	
	public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails) {

        for(int p=0; p<=1000; p++)
            for(int b=0; b<=1000; b++)
                for(int d=0; d<=1000; d++)
                    if(p*4+b*4+d*2 == webbedFeet &&
                            p+b == beaverTails &&
                            d+p == duckBills)
                        return d+p+b;

        return -1;
	}
}
