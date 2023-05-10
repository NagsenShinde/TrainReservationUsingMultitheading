package Multithreading;

public class Demo2 extends Thread {
	public void run()
	{
		System.out.println("Nagsen shinde");
	}
	public static void main(String[] args) {
		Demo2 n=new Demo2();
		n.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Nagsen");
		System.out.println(Thread.currentThread().getName());
		

	}

}
