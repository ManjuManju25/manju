package starPattern;

public class Star3
{
	public static void main(String[] args) {
		int size=4;
		for (int i = 0; i < size; i++) 
		{
			for (int j = 1; j < size-i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
           
		
//		 int size = 5;
//		    // loop to print the pattern
//		    for (int i = 0; i < size; i++) {
//		      // print spaces
//		      for (int j = 1; j < size - i; j++) {
//		        System.out.print(" ");
//		      }
//		      // print stars
//		      for (int k = 0; k <= i; k++) {
//		        System.out.print("*");
//		      }
//		      System.out.println();
		}
	}
}
