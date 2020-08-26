class Objects{
	
	String obj1;
	static String obj2;
	
	void keys(){
		System.out.println("Keys: " + obj1);
	}
	
	static void bord(){
		System.out.println(obj2);
	}
}


class StaticKeyWord{
	public static void main(String[] args){
		Objects.obj2 = "window";
		Objects.bord();
		
		Objects myObject = new Objects();
		
		myObject.obj1 = "Blackbord";
		
		double a = (Math.PI);
		System.out.println(a);
		myObject.keys();
		
	}

}