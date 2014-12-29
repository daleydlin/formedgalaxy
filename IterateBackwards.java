package Final;

public class IterateBackwards {
	private int[] testArray = {1,2,3,4,5,6,7,8,9};

	public void showMap(){
	for( int index = testArray.length - 1; index >= 0; --index){
	System.out.println(testArray[index]);
	}
	}
	public static void main (String [] args) {
	IterateBackwards back = new IterateBackwards();

	back.showMap();
	}
	}