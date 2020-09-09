class StaticEx1{
	int x;
	int y;
	
	public static void sum(int x, int y){
		int z = x + y;
		System.out.println(z);
	}
}


class StaticKeyWord4{
	public static void main(String[] args){
		
		StaticEx1.sum(23, 45);
		StaticEx1 obj = new StaticEx1();
		
		
		
	}
}