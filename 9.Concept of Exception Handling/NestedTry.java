class NestedTry
{
	public static void main(String[] args) {
		int a=2, b=5;
		try{
			b = b/Integer.parseInt(args[0]);
			System.out.println(b);
			try{
				a = a/Integer.parseInt(args[1]);
				System.out.println(a);
			}
			catch(ArithmeticException e){
				System.out.println("case 1:\n" + e);
			}
			catch(IndexOutOfBoundsException i){
				System.out.println("case 2:\n" + i);
			}
		}
		catch(ArithmeticException u){
			System.out.println("case 3:\n" + u);
		}
		catch(IndexOutOfBoundsException v){
			System.out.println("case 4:\n" + v);
		}
		System.out.println("\n***END***");
	}
}