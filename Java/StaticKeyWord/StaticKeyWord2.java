class Static{
	
	int num;
	static String animal;
	
	public void output(){
		System.out.println( animal + " " + num);
	}
	
	
	
	
}



class StaticKeyWord2{
	public static void main(String[] args){
		Static obj1 = new Static();
		
		obj1.num = 23;
		obj1.animal = "Dog";
		obj1.animal = "Lion";
		obj1.output();
		
		Static obj2 = new Static();
		
		obj2.num = 24;
		obj2.animal = "Tiger";
		obj2.animal = "Cat";
		obj2.output();
	}
	
}