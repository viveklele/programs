class StringBuilderAndFormatingString{
	public static void main(String[] args){
		
		String info = "";
		
		info += "My name";
		
		info += " is";
		
		info += " LoctSky";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("How ");
		sb.append("are ");
		sb.append("you ");
		System.out.println(sb.toString()); 
		
	}
	
	
}