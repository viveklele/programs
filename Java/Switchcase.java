import java.util.Scanner;
class Switchcase{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the commad: ");
	String text = input.nextLine();
	
		switch(text){
			case "1":
			System.out.println("Hello");
			break;
			case "2":
			System.out.println("Hello John");
			break;
			
			default:
			System.out.println("Please enter something!");
			
		
		
		}
	
	
	
	}
}