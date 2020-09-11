final class Animal{
	static void dog(){
		System.out.println("Dog is tall");
}

}



class CheckFinalKeyword extends Animal{
	public static void main(String[] args){
		
		CheckFinalKeyword animal = new CheckFinalKeyword ();
		CheckFinalKeyword.dog();	
		
		
	
	}

}
