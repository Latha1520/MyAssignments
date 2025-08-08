package week3.day1;

public class OddIndexToUppercase {
	
	public static void main(String[] args) {
		
		 String test = "changeme";
		 //				01234567
		 char[] charArray = test.toCharArray();
		 
		 for (int i = 0; i < charArray.length; i++) {
			 
			 if(i%2!=0)
				 //0%2==1
				 //1%2==1
				 
			 {
				char a= charArray[i];
				
				char upperCase = Character.toUpperCase(a);
				
				System.out.print(upperCase); 

				//cHaNgEmE	
				//ChAnGEME
						
			 }
			 
			 else 
			 {
				System.out.print(charArray[i]); 
				 
			 }
			 }
			 
			
			 }
			
		}
		



