package array;

public class A001_ArrayDemo1 {
	public static void main(String[] args) {
		
		//declaration
		int a[] = new int[5];
		
		//inialization
		a[0] = 10;
		a[1] = 20;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("****************************");
		
		int[] b = {10,20,30,40,50};
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("***********************");
		
		String subject[] = {"Java","Php","Python","android"};
		
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		
		System.out.println("**************************");
		char ch[] = {'A','B','X','M'};
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
		
	}
}
