import java.util.*;
class SumOfOddNum{
	public static void main(String[] args){
		int c = 0;
		for(int i=20; i<=40; i++){
			if(i%2 != 0){
				c = c+i;
				
			}
		}
		System.out.println(c);
	}
	
}