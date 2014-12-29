package Final;

public class FindOddNum {
		
		private int[] source = {1,2,3,4,5,6,7,8,9,10};
		
		public void showArray(){
			for(int idx = 0; idx < source.length; ++idx){
				System.out.println(source[idx]);
			}
		}

		public void showodd(){
		for(int index = 0; index < source.length; ++index){ 
		if(source[index] %2 != 0){ 
		System.out.println("These are the odd numbers"+ source[index]); 
		System.out.println("These are the index of the odd numbers"+index);
		}
		}
		}
		
	public static void main(String[] args) {
	FindOddNum fon = new FindOddNum();
	fon.showArray();
	fon.showodd();
		
}
}