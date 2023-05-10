package Multithreading;

public class Demo3 extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		Thread.currentThread().setName("Naguu..");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.start();
	 

	}

}
