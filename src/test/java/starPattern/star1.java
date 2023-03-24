package starPattern;

public class star1 {

	public static void main(String[] args) {
		int size=5;
		//outer
		for(int i=0;i<size;i++)
			//i=0 0<5(t)
		{
			//inner
			for(int j=0;j<size;j++)
				//
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
