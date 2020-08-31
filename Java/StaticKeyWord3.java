class Summetion{
	
	int n;
	int a = 12;
	
	public int sum(){
		n = a * 10;
		return n;
		
	}
	
	
}



class StaticKeyWord3{
	public static void main(String[] args){
		Summetion sum1 = new Summetion();
		
		System.out.println(sum1.sum());
	}	
}