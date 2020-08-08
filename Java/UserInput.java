import java.util.Scanner;

class UserInput{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number: ");
	
	String number = input.nextLine();
	
	System.out.println("You Enter number was: " + number);
	
	}
} 