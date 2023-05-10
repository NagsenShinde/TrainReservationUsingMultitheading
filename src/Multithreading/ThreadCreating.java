package Multithreading;

public class ThreadCreating extends Thread{
	public void run()
	{
		System.out.println("1st task is completed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreating t=new ThreadCreating();
		t.start();

	}
	}

