class Car implements Info{
	private String name;
	public void tesla(){
		System.out.println("tesla moters");
	}
	
	public Car(String name){
		this.name = name;
	}
	
	public void showInfo(){
		System.out.println("Name is :" + name);
	}
}


