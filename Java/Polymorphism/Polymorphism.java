public class Polymorphism{
	public static void main(String[] args){
		Galaxy galaxy1 = new Galaxy();
		Universe universe1 = new Universe();
		Galaxy galaxy3 = new Galaxy();
		
		Galaxy galaxy2 = universe1;
		galaxy1.distance();
		
		universe1.stars();
		manyStar(universe1);
	}	
		public static void manyStar(Galaxy galaxy){
			galaxy.distance();
		}
	

}

