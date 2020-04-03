class FinalBlock
{
	public static void main(String[] args) {
		int a=2;
		try{
			a = a/Integer.parseInt(args[0]);
			System.out.println("The value of A = " + a + ".");
		}catch(Exception p){
			System.out.println(p);
		}finally{
			System.out.println("Program Ends Here.");
		}
	}
}