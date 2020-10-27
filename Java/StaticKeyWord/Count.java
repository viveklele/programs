class Count{
	static int x = 0;
	Count(){
		x++;
	}
	
	
	
	public static void main(String[] args){
		
		Count obj = new Count();
		Count obj1 = new Count();
		System.out.println(x);
	}
}