class Getters{
	int numbers;
	String name;
	
	int calculateSum(){
		
		int x = 12 + numbers;
		// System.out.println(x);
		return x;
	}
	String Name(){
		return name;
	}
}
class GetterAndReturn{
	
	public static void main(String[] args){
		
		Getters obj1 = new Getters();
		obj1.numbers = 12;
		obj1.name = "John";
		int calculation = obj1.calculateSum();
		System.out.println("calculation is " + calculation);
		
		String name = obj1.Name();
		System.out.println("The name is: " + name);
	}   
	
	
}
	

