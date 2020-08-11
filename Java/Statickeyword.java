import java.util.*;
class Statickeyword{
	Statickeyword(int a){
		int b = a * 10;
		System.out.println("a = "+a+", b = "+b);
	}
	
	public static void main(String[] args){
		Statickeyword static_ = new Statickeyword(5);
		
	}
}