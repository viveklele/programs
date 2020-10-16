import java.util.*;
class FindFactorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int i;
		int c = 1;
		for(i=num; i>0; i--){
			c = c*i;
			System.out.print(i);
			if(i>1){
				System.out.print("*");
			}
		}
		System.out.println(" = " + c);
		
	}
}