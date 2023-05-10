package Multithreading;

public class Demo5 extends Thread {
	public void run()
	{
		System.out.println("Nagsen shinde");
	}

	public static void main(String[] args) {
		System.out.println("Cloudsmartz");
		Demo5 d =new Demo5();
		d.setDaemon(true);
		d.start();
		
		
		 

	}

}
