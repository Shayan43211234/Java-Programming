class Thread1 extends Thread{
	public void run(){
		for (int i=1; i<=5; i++) {
			System.out.println("Thread1 " + i);
		}
		System.out.println("Exit Thread1......");
	}
}

class Thread2 extends Thread{
	public synchronized void run(){
		for (int j=1; j<=5; j++) {
			System.out.println("Thread2 " + j);
		}
		System.out.println("Exit Thread2......");
	}
}

public class ThreadSyn{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}