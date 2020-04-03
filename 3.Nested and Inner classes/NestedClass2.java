class CPU
{
	class Processor
	{
		void getClock(){
			System.out.println("This PC has 2.4 GHz clock speed.");
			Ram r = new Ram();
			r.getCache();
		}
	}
	
	protected class Ram
	{
		void getCache(){
			System.out.println("Your PC has 1024 KB cache memory.");
		}
	}
}

class MainCPU
{
	public static void main(String args[])
	{
		CPU c = new CPU();
		CPU.Processor p = c.new Processor();
		p.getClock();
	}
}