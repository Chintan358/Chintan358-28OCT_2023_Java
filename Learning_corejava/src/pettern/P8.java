package pettern;

public class P8 {
	public static void main(String[] args) {
		
//		    *
//		   ***
//		  *****
//		   ***
//			*
		
		
		int lines = 9;
		int starCount = 1;
		int spaceCount = lines-1;
		int mid = (lines/2)+1;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<mid)
			{
			starCount = starCount+2;
			spaceCount--;
			}
			else
			{
				starCount = starCount-2;
				spaceCount++;
			}
		}
		
		
		
		
	}
}
