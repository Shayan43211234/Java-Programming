class ArithmaticExcep
{
	public static void main(String[] args) {
		int a = 2;
		try{
			a = a/0;
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("The value of = " + a + ".");
		}
		System.out.println("Program Ends Here.");
	}
}