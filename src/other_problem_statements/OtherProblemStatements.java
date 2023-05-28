package other_problem_statements;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class OtherProblemStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=5;
		int num=1;
		int missing=0;
		List<Integer> obj=new ArrayList<>();
		obj.add(4);
		obj.add(3);
		obj.add(1);
		obj.add(5);
		//Legacy method
		/*Collections.sort(obj);
		for(Integer n:obj) {
			if(n!=num) {
				System.out.println("Missing: "+num);
				break;
			}
			num++;
		}*/
		
		
		
		//sum of n numbers n(n+1)/2
		int total = (range*(range+1))/2;
		
		//sum of available numbers 
		int[] arr = new int[]{4,3,1,5};
		IntSummaryStatistics sumStat= IntStream.of(arr).summaryStatistics();
		long availableSum = sumStat.getSum();		
		//difference 
		System.out.println("Missing: "+(total-availableSum));
		

	}

}
