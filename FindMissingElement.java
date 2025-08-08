package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		int[] input = {1, 4, 3, 2, 8, 6, 7};
		
		Arrays.sort(input);
		//0 1 2 3 4 5 6 //i
		//1 2 3 4 6 7 8 //i[]
		
		//1= i ;1+1= i+1
		
		for (int i = 0; i < input.length-1; i++) {
			
			if(input[i + 1]!=input[i]+1)
				
			
			{
			
		System.out.println(input[i]+1);
			
			
			
		}
	}

}
}