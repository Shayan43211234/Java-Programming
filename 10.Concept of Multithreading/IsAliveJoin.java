class Thread1 extends Thread
{
	public void run(){
		for (int i=1; i<=5; i++)
			System.out.println(isAlive() + " " + i);
	}
}

class IsAliveJoin
{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		try{t1.join();}
		catch(InterruptedException e){
			System.out.println(e.toString());
		}
		System.out.println("Main Thread Statement : Thread t1 status : " + t1.isAlive());
	}
}