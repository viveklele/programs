class StaticKey{
	
	int age;
	static String name;
	static String things = "Battery";
	static int number = 23;
	
	static void change(){
		things = "Objects";
		
	}
	void StaticKey(int a, String b){
		age = a;
		name = b;
		
	}
	void display(){
		System.out.println(age + " " + name + " " + things);
	}
	int calculate(int x){
		return x*x*x;
	}
		
}

class StaticKeyWord1{
	public static void main(String[] args){
		StaticKey.change();
		// int result = StaticKey.calculate(5);
		
		StaticKey obj1 = new StaticKey();
		StaticKey obj2 = new StaticKey();

		obj1.StaticKey(22, "Pensil");
		obj2.StaticKey(23, "Eresor");
		int result = StaticKey.number;
		System.out.println(result);
		// System.out.println(number);
		obj1.display();
		obj2.display();
		
	}
	
	
	
}
