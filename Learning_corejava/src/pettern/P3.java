package pettern;

public class P3 {
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		
		int lines = 9;
		int starCount = 1;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount++;
		}
		
		
		
		
	}
}
