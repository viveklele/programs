class PrimeNum{
	public static void main(String[] args){
		for(int i=10; i<=15; i++){
			boolean isprime = true;
			for(int j=2; j<i; j++){
				
				if((i%j) == 0){
					isprime = false;
					break;
				}
			}
			if(isprime){
				System.out.println(i);
			}
		}
	}
	
}