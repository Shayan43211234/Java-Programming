public class StringBuff{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Append : " + sb.append(" World"));
		System.out.println("Insert : " + sb.insert(5, "w"));
		System.out.println("Replace : " + sb.replace(5, 6,"a"));
		System.out.println("Delete : " + sb.delete(5, 6));
		System.out.println("Reverse : " + sb.reverse());
	}
}