/*
 * Dale Yan Lin
 */
package Final;

public class FinalArray {

	private int[] nums = {23,33,43,53,63,73,83,93};
	public double[][] dbArray = new double[4][3]; 	 //[rows][columns]		
	
	public void showArray(){
		for(int idx = 0; idx < nums.length; ++idx){
			System.out.println(nums[idx]);
		}
	}
	
	public void loaddoublearray(){
		for (int i = 0; i < dbArray.length; i++) {
			for (int j = 0; j < dbArray[i].length; j++) {
				int randNum = (int)(Math.random()*12) + 1; //load random values from 0-100
				dbArray[i][j] = randNum;					//assign array a randNum
				System.out.print(dbArray[i][j]+"\t");		//print the array
			}	
			System.out.print("\n"); //print a new line after each row. 
	}
	}
	
	public void printlastelement(){
		System.out.print(dbArray[3][2]);
	}
	
	public void replaceoddindex(){
	for(int index = 0; index < nums.length; ++index){ 
	if(index %2 == 0){ 
		nums[index]=0;
	}
	}
	}
	
public static void main(String[] args) {
FinalArray fon = new FinalArray();
fon.replaceoddindex();
fon.showArray();
fon.loaddoublearray();
fon.printlastelement();
}
	
}
