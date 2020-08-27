class Animal{
	private int id;
	private String name;
	
	Animal(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ").append(name);
		return sb.toString();
	}
	
}
class ToString{
	public static void main(String[] args){
		// Here you should dont want to call the method.
		Animal obj1 = new Animal(12, "Hyna");
		System.out.println(obj1);
		
	}
}