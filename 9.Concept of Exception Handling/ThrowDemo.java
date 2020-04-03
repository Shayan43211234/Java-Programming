class ThrowDemo{
	static void demoproc(){
		try{
			throw new NullPointerException("demo");
		}catch(NullPointerException e){
			System.out.println("Catch inside demoproc.");
			throw e; //rethrow the exception
		}
	}

	public static void main(String[] args) {
		try{
			demoproc();
		}catch(NullPointerException e){
			System.out.println("Recatch : " + e);
		}
	}
}