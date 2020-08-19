class MultidimentionalArray{
	public static void main(String[] args){
		int[][] array = {
		{12, 23, 43, 54},
		{12, 45, 33, 55},
		};
	
		
	
		for(int row=1; row<array.length; row++){
			for(int col=0; col<array[row].length; col++){
				System.out.print(array[row][col]+"\t");
			
			}
			System.out.println();
		}
		
		String[][] name = new String[2][3];
		name[0][1] = "How are you ";
		System.out.println(name[0][1]);
	}
}