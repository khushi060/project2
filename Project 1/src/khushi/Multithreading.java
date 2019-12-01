package khushi;

//class Hi extends Thread

/*class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
			
		}
	}
}
//class Hello extends Thread
class Hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
			
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		t2.start();
	}

}
*/



// Multithreading using Anonymous class and Lambda expression


public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(()-> 
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}	
		}
		);
		Thread t2=new Thread(() -> 
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
		});
		t1.start();
		try{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		t2.start();
		
	}

}
