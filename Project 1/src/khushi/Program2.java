package khushi;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1-D Array
	/*Scanner s=new Scanner(System.in);
	Random r=new Random();
	//int n=s.nextInt();
	int a[]=new int[50];
	for(int i=0;i<a.length;i++)
	{
		a[i]=r.nextInt(50);
	}
	try{
	System.out.println(a[52]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("not correct");
	}
	
	for(int j:a)
	{
		System.out.println(j);
	}
*/
		
		
		
		// 2-D Jagged Array
		
		/*Scanner s=new Scanner(System.in);
		//int b[][]={ {2,3,4,5},{5,6,7},{7,8,9,2,3}};
		int a[][]=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[5];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		*/
		
		
		// 3-D Array
		
		/*Scanner s=new Scanner(System.in);
		Random r=new Random();
		//int b[][]={ {2,3,4,5},{5,6,7},{7,8,9,2,3}};
		int a[][][]=new int[3][3][3];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
				a[i][j][k]=r.nextInt(100);
				}
			}
		}
		for(int i[][]:a)
		{
			for(int j[]:i)
			{
				for(int k:j)
				{
				System.out.print(k + " ");
				}
			}
			System.out.print("\n");
		}
		*/
		
		
		// 3-D Jagged Array
		
		/*
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		//int b[][]={ {2,3,4,5},{5,6,7},{7,8,9,2,3}};
		int a[][][]=new int[3][][];
		a[0]=new int[3][];
		a[1]=new int[4][];
		a[2]=new int[2][];
		a[0][0]=new int[2];
		a[0][1]=new int[2];
		a[0][2]=new int[2];
		a[1][0]=new int[2];
		a[1][1]=new int[2];
		a[1][2]=new int[2];
		a[1][3]=new int[2];
		a[2][0]=new int[2];
		a[2][1]=new int[2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
				a[i][j][k]=r.nextInt(100);
				}
			}
		}
		for(int i[][]:a)
		{
			for(int j[]:i)
			{
				for(int k:j)
				{
				System.out.print(k + " ");
				}
			}
			System.out.print("\n");
		}
		
		*/
		/*
		 Scanner s=new Scanner(System.in);
	        int a=s.nextInt();
	        double b=s.nextDouble();
	        String e=s.next();
	        String str=s.nextLine();
	        
	        
	        int c=(int)(b);
	        int g=a+c;
	        double f=b+b;
	        
	        System.out.println(g);
	        System.out.println(f);
	        System.out.println("Hackerrank "+e +str);
		*/
		String a="1.10234 MB";
		int l=a.length();
		String str=a.substring(0,l-3);
		double x=Double.parseDouble(str);
		System.out.println(x);
	}

}
