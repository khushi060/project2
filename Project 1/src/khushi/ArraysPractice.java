package khushi;

import java.util.Scanner;
public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* BUBBLE SORT
		Scanner s=new Scanner(System.in);
		int i;
		int j;
		int temp;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		*/
		
		//PBL Q7--incomplete
		/*Scanner s=new Scanner(System.in);
		int i;
		int j;
		int k=0;
		boolean flag=false;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				b[k]=a[i];
				k++;
			}
			
		}
		
		//int l=b.length;
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		*/
		
		//Q9
		/*Scanner s=new Scanner(System.in);
		int i;
		int count=0;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==10)
			{
				count++;
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		for(i=0;i<count;i++)
		{
			System.out.print("0"+" ");
		}
		
		*/
		
		//Q10
		/*Scanner s=new Scanner(System.in);
		int i;
		int j=0;
		int count=0;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				b[j]=a[i];
				j++;
				count++;
			}
		}
		//int l=b.length;
		for(i=0;i<count;i++)
		{
			System.out.print(b[i]+" ");
		}
		*/
		
		//Q11
		/*Scanner s=new Scanner(System.in);
		int i;
		int count=0;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if((a[i]==1)||(a[i]==4))
			{
				count++;
			}
		}
		if(count==n)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		*/
		
		//Q12 (modified for even no of elements also which prints avg of 2 middle nos)
		/*Scanner s=new Scanner(System.in);
		int i;
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		int[] c=new int[2];
		double[] d=new double[2];
		if(n%2!=0)
		{
			int k=(n/2);
			c[0]=a[k];
			c[1]=b[k];
			System.out.print(c[0]+" ");
			System.out.print(c[1]);
		}
		else
		{
			int p=n/2;
			int q=(n/2)-1;
			int e=a[q];
			int f=a[p];
			int g=b[q];
			int h=b[p];
			
			d[0]=(e+f)/2.0;
			d[1]=(g+h)/2.0;
			System.out.print(d[0]+" ");
			System.out.print(d[1]);
			
		}
		*/
		
		//Q13
		
		
		
		

	}

}
