package Final;

public class FindEven {
		
		private int[] source = {1,2,3,4,5,6,7,8,9,10};
		
		public void showArray(){
			for(int idx = 0; idx < source.length; ++idx){
				System.out.println(source[idx]);
			}
		}

		public void showeven(){
		for(int index = 0; index < source.length; ++index){ 
		if(source[index] %2 == 0){ 
		System.out.println(source[index]); 
		//System.out.println("These are the index of the even numbers"+index);
		}
		}
		}
		
	public static void main(String[] args) {
	FindEven fon = new FindEven();
	fon.showArray();
	fon.showeven();
		
}
}