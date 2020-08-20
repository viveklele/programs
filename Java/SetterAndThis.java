class Cat{
	
	int age;
	String name;
	
	void catName(String newName){
		name = newName;
	}
	
	void catColour(String colour){
		System.out.println(colour);
	}
	
	void catAge(int age){
		System.out.println("Cat age is " + age + " years.");
		
	}
}
class SetterAndThis{
	public static void main(String[] args){
		
		Cat cat1 = new Cat();		// Create object for Cat class.
		
		cat1.name = "The cat name is: Jerry";
		// cat1.catName("Manney");
		cat1.catColour("Cat colout is: White");
		
		System.out.println(cat1.name);
		
		cat1.catAge(3);
	}
	
}