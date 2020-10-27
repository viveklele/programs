class PrimeNum{
	public static void main(String[] args){
		for(int i=10; i<=15; i++){
			int isprime = 0;
			for(int j=2; j<i; j++){
				
				if((i%j) == 0){
					isprime = 1;
					break;
				}
			}
			if(isprime == 0){
				System.out.println(i);
			}
		}
	}
	
}