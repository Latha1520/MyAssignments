package week1.day2;

public class IsPrime {
	

	
	public static void main(String[] args) {
		
		//To determine if a number n is prime, one must check divisibility from 2 to n−1.
		
		//IsPrime primeCheck = new IsPrime();
		
		int n = 100;
		
		for (int i = 2; i <=n-1; i++) {
			
			if (n%i==0)
				
				{
				System.out.println(n+ " is not prime number");
				
				break;
				
				}
				
				else
				{
					System.out.println(n+ " is prime number");
					
					break;
				}
			
		
			
		}
		
		
		
	}

}