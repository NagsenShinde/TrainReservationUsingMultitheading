package Multithreading;

public class Demo4 extends Thread {

	public static void main(String[] args) {
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
		 Demo4 d=new Demo4();
		 d.start();
	}

}
