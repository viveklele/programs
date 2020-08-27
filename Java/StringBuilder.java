import java.util.*; 
public class StringBuilderAndFormatingString{
	public static void main(String[] args){
		
		String info = "";
		
		info += "My name";
		
		info += " is";
		
		info += " LoctSky";
		
		System.out.println(info);
		
		String s1;
		
		s1 = "My" + "New" + "String";
		
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("");

		
		sb.append("How ");
		sb.append("are ");
		sb.append("you ");
		System.out.println(sb.toString()); 
		
	}
	
	
}