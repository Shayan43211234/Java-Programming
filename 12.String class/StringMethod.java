public class StringMethod{
	public static void main(String[] args) {
		String val = "Hello";
		String val1 = "hello";
		
		String upd;
		upd = val.toUpperCase();
		System.out.println("UpperCase : " + upd);
		
		String lpd;
		lpd = val.toLowerCase();
		System.out.println("LowerCase : " + lpd);
		
		System.out.println("startsWith H : " + val.startsWith("H"));
		System.out.println("endsWith w : " + val.endsWith("w"));
		System.out.println("charAt 4 : " + val.charAt(4));
		System.out.println("length : " + val.length());
		System.out.println("equals : " + val1.equals(val));
		System.out.println("replace : " + val.replace('o','w'));
		System.out.println("substring : " + val.substring(0, 2));
	}
}