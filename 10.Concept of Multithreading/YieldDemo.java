class A extends Thread
{
	public void run(){
		for (int i=1; i<=5; i++) {
			if(i==3)
				yield();
			System.out.println("A : " + i);
		}
	}
}

class B extends Thread
{
	public void run(){
		for (int i=1; i<=5; i++) {
			System.out.println("B : " + i);
		}
	}
}

class YieldDemo
{
	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		ob1.start();
		ob2.start();
	}
}