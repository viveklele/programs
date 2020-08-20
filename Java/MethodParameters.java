class Player{
	
	public void sum(int x, int y){
		System.out.println("The sum of x any y is : " + x + y);
	}
	public void hello(String message){
		System.out.println(message + " sam.");
	}
	
}

class MethodParameters{
	
	public static void main(String[] args){
		Player player1 = new Player();
		
		player1.sum(12, 34);
		
		String myMessage = "Come play at 8:00 clock";
		player1.hello(myMessage);
		
		
	}	
}