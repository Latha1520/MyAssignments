package week3.day1;


public class Occurrences {

	public static void main(String[] args) {

		String input = "TestLeaf";
		//		01234567		
		int count = 0;



		char[] a  = input.toCharArray();

		for (int i = 0; i < a.length; i++) {

			//System.out.println(a[i]);

			if(a[i]=='e')
				//if(a[i]=='T'||a[i]=='t')

			{

				count++;

			}

		}
		System.out.println(count);
	}

}
