import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DistinguishableSetDiv2 {
	
	public int count(String[] answer) {
		int N = answer.length;
		int M = answer[0].length();

		int total = 0;

		boolean[] uniqueColumn = new boolean[M];

		Set<String> set = new HashSet<>();


		int subsets = (int)Math.pow(2, M);
		for(int i=0;i<subsets; i++){//for every combination

			String bin = Integer.toBinaryString(i);
			for(int j=0; j<(M-bin.length());)
				bin = ("0")+bin; //fill with zeros

			ArrayList<Integer> questionsToGet = columnsToGet(bin);

			for(int r=0; r<N; r++){//for each person
				String questionSeq = "";
				for(int questionNum: questionsToGet)
					questionSeq+= answer[r].charAt(questionNum);

				set.add(questionSeq);
			}

			if(set.size() == N)
				total++;

			set.clear();
		}

		return total;
	}

	private static ArrayList<Integer> columnsToGet(String binaryString){
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=0; i<binaryString.length(); i++){
			if(binaryString.charAt(i) == '1')
				al.add(i);
		}

		return al;
	}

}
