class Cat{
	
	int age;
	String name;
	// this keyword is used to knowing the compiler difference between instance and local variable.
	// Here, age and name are instance variables.
	void catName(int age, String name){
		this.age = age;
		this.name = name;	
	}
	
	void showData(){
		System.out.println("age = " + age);
		System.out.println("name = " + name);
		
	}
	
	
}
class SetterAndThis{
	public static void main(String[] args){
		
		Cat cat1 = new Cat();		// Create object for Cat class.
		
		cat1.catName(23, "Jerry");
		cat1.showData();
	}
	
}