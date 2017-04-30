import java.util.ArrayList;

public class SRM609DIV1 {

    //FINAL SUBMISSION, 75 points/250points
    public static class MagicalStringDiv11{

        public int getLongest(String input){

            int inputLength = input.length();

            if(inputLength < 2) return 0;

            int l = 0;
            int r = input.length()-1;

            int greaterCount = 0;
            int lesserCount = 0;

            while(l<=r){
                if(input.charAt(l) == '>')
                    greaterCount++;
                if(input.charAt(r) == '<')
                    lesserCount++;

                l++;
                r--;
            }

            greaterCount*=2;
            lesserCount*=2;
            return greaterCount <= lesserCount ? greaterCount : lesserCount;
        }
    }

    public static int count3(String input){
        int max = 0;

        char[] in = input.toCharArray();

        int current_greaters = 0;
        int current_lessers = 0;

        char lastChar;

        lastChar = in[0];

        if(in[0] == '<')
            current_lessers++;
        else
            current_greaters++;


        for(int i=1; i<in.length; i++){
            char currentChar = in[i];
            lastChar = in[i-1];

            if (currentChar == '>'){
                current_greaters++;

                if(lastChar == '>'){
                    //do nothing
                }else if (lastChar == '<'){
				/*
					if(current_lessers <= current_greaters){
						if(current_greaters > max)
							max = current_greaters;
						}
					}
					*/
                    current_greaters = 1;
                    current_lessers = 0;
                }
            }else if(currentChar == '<'){
                current_lessers++;
                //	if(lastChar == '>'){
                if(current_lessers <= current_greaters){
                    if(current_lessers > max)
                        max = current_lessers;
                }
                //}
            }
        }//for

        return max;
    }

    //this was the submit1 code but without system.out.println;
    public static int getLongest(String input){
        int largest;

        int inputLength = input.length();

        int[] greaters_before = new int[inputLength]; //INCLUSIVE HERE!
        int[] lessers_after = new int[inputLength];

        int greater_than_count = 0;
        //count greaters before. INCLUSIVE
        for(int i=0; i< inputLength; i++){
            greaters_before[i] = greater_than_count;

            if(input.charAt(i) == '>')
                greaters_before[i] = ++greater_than_count;

        }

        int lesser_than_count = 0;
        //count lessers after. NOT INCLUSIVE
        boolean lesserFlag = false;
        for(int i=inputLength-1; i>=0 ;i--){
            lessers_after[i] = lesser_than_count;

            if(lesserFlag == true){
                lessers_after[i] = ++lesser_than_count;
                lesserFlag = false;
            }

            if(input.charAt(i) == '<'){
                lesserFlag = true;
            }
        }

        //find ideal index where greaters/lessers ratio
        //between greaters_before and lessers_after is
        //equal to 1 but that the greaters is the highest
        //among all possible candidates of ratio 1
        double ratio = 0;
        int largest_G = 0;//

        ArrayList<Integer> gb = new ArrayList<>();
        ArrayList<Integer> la = new ArrayList<>();
        for(Integer x: greaters_before){
            gb.add(new Integer(x));
        }

        for(Integer x: lessers_after){
            la.add(new Integer(x));
        }


        //System.out.println("GB: " + gb.toString());

        System.out.println("GB");
        for(int i=0; i<gb.size(); i++){
            System.out.print(i+ ":" + gb.get(i)+ ", " );
        }
        System.out.println("");

        System.out.println("LA");
        for(int i=0; i<la.size(); i++){
            System.out.print(i+ ":" + la.get(i)+", ");
        }

        System.out.println("");

        for(int i=0; i<inputLength; i++){

            if(lessers_after[i] !=0){
                if(greaters_before[i] == lessers_after[i])
                    ratio = 1;
            }

            if(ratio == 1){
                System.out.println("Detected 1 ratio @ " + i + " T:"+greaters_before[i]+"D:" + lessers_after[i]);
                if(greaters_before[i] > largest_G)
                    largest_G = greaters_before[i];
                System.out.println("Updated largest_G to: " + largest_G + "@index " + i);
            }

            ratio = 0;
        }

        return 2*largest_G;
    }

    public static void submission1(){
		/*
		 * public class MagicalStringDiv1{

	public int getLongest(String input){
		int largest;

		int inputLength = input.length();

		int[] greaters_before = new int[inputLength]; //INCLUSIVE HERE!
		int[] lessers_after = new int[inputLength];

		int greater_than_count = 0;
		//count greaters before. INCLUSIVE
		for(int i=0; i< inputLength; i++){
			greaters_before[i] = greater_than_count;

			if(input.charAt(i) == '>')
				greaters_before[i] = ++greater_than_count;

		}

		int lesser_than_count = 0;
		//count lessers after. NOT INCLUSIVE
		boolean lesserFlag = false;
		for(int i=inputLength-1; i>=0 ;i--){
			lessers_after[i] = lesser_than_count;

			if(lesserFlag == true){
				lessers_after[i] = ++lesser_than_count;
				lesserFlag = false;
			}

			if(input.charAt(i) == '<'){
				lesserFlag = true;
			}
		}


		double ratio = 0;
		int largest_G = 0;//

		for(int i=0; i<inputLength; i++){

			if(greaters_before[i] == lessers_after[i]){
				ratio = 1;
			}

			if(ratio == 1){
				//System.out.println("Detected 1 ratio @ " + i);
				if(greaters_before[i] > largest_G)
					largest_G = greaters_before[i];
					//System.out.println("Updated largest_G to: " + largest_G + "@index " + i);
			}

			ratio = 0;
		}

		return 2 * largest_G; //largest_G represents only the greaters, so multiply by 2!
	}

}
		 */

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
		String[] x = {">", "<", "><", "<<", "<>", "<<", ">><<", "<>><<><<<>>><<", "<>><<", "<<>", ">>"};

		for(String p: x){
			System.out.println(p+": " + getLongest(p));
		}
		*/

        System.out.println("\n\n");
        System.out.println(getLongest("<><><<>"));
        System.out.println(getLongest(">>><<<"));
        System.out.println(getLongest("<<<>>>"));
        System.out.println(getLongest("<<<<><>>><>>><>><>><>>><<<<>><>>>>><<>>>>><><<<<>>"));


    }

}
