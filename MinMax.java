package Final;

	import java.util.ArrayList;

	public class MinMax {

	private ArrayList<Integer> intArry = new ArrayList<Integer>();

	public void loadList(){
	for(int index = 0; index < 50; ++index){
	intArry.add((int) (Math.random()*100+1));
	}

	}

	public Integer Min(){
	Integer min = intArry.get(0);
	for(int index = 0; index < intArry.size(); index++){
	if(min < intArry.get(index)){
	min = intArry.get(index);
	}
	}return min;
	}

	public Integer Max(){
	Integer max = intArry.get(0);
	for(int idx = 0; idx < intArry.size(); ++idx){
	if(max > intArry.get(idx)){
	max = intArry.get(idx);
	}
	}
	return max;
	}

	public static void main (String[] args) {
	//String numMaxorMin = null;
	//int param = Integer.parseInt(args [0]);
	MinMax maxmin = new MinMax();
	maxmin.loadList();
	System.out.print("Min:" +maxmin.Min());
	System.out.print("Max:" +maxmin.Max());
	}
	}

