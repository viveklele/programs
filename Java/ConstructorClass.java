class Machine{
	
	String words;
	
	Machine(){
		this("Robot");

		System.out.println("My first constructor");
		
	}
	// Machine(String name){
		// System.out.println("My Second constructor name is : " + name);
	// }
	
	Machine(String words){
		System.out.println("My second constructor name is : " + words);
		this.words = words;
	}
}



class ConstructorClass{
	public static void main(String[] args){
	Machine machine1 = new Machine();
	new Machine("Tom");
	new Machine("Jerry");

	}
}

