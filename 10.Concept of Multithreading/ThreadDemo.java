class Thread1 extends Thread
{
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println("Thread1 " + i);
		}
		System.out.println("Thread1 Exit");
	}
}

class Thread2 implements Runnable
{
	public void run(){
		for (int i=0; i<10; i++)
			System.out.println("Thread2 " + i);
		System.out.println("Thread2 Exit");
	}
}

class ThreadDemo
{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t1.start();
		t.start();
	}
}