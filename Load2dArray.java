package Final;

public class Load2dArray {

	public int[][] intArray = new int[4][5]; 	 //[rows][columns]		
	
	public void loadlist(){
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int randNum = (int)(Math.random()*101) + 1; //load random values from 0-100
				intArray[i][j] = randNum;					//assign array a randNum
				System.out.print(intArray[i][j]+"\t");		//print the array
			}	
			System.out.print("\n"); //print a new line after each row. 
	}
	}
	
	public static void main(String[] args) {
		Load2dArray rl = new Load2dArray();
		rl.loadlist();
		System.out.print(rl.intArray[0][1]);

	}

}
