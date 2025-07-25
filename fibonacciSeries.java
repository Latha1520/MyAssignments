package week1.day2;

public class fibonacciSeries {
	
	public static void main(String[] args) {
		
 int range = 8;
 int prev_value = 0;
 int next_value = 1;
 
 System.out.println(prev_value );
 System.out.println(next_value );
 
 for (int i = 0; i < range-2; i++) {
	 
	 int new_value = prev_value+next_value;
	 
	 System.out.println(new_value);
	 
	 prev_value = next_value;
	 next_value = new_value;
	 
	
}
		
	}

}
