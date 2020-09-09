class Interfaces{
	public static void main(String[] args){
		Product prod1 = new Product();
		prod1.sell();
		
		Car car1 = new Car("Testa");
		car1.tesla();
		
		Info info1 = new Product();
		info1.showInfo();
		
		Info info2 = car1;
		info2.showInfo();
		
		outputInfo(prod1);
		outputInfo(car1);
	}
	
	private static void outputInfo(Info info){
		info.showInfo();
	}
}