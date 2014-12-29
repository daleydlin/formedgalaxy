package Final;

import java.util.*;

public class HashMapDemo2{

private HashMap<String, String> map;

public HashMapDemo2(){
map = new HashMap<String, String>();
}

public String getCapital(String studentid){
return map.get(studentid);
}

public void loadMap(String studentid, String numbergrade){
map.put(studentid, numbergrade);
}

public static void main (String [] args) {
HashMapDemo2 testMap = new HashMapDemo2();

testMap.loadMap("California", "Sacramento");
System.out.println(testMap.getCapital("California"));
testMap.loadMap("Nevada", "Carson City");
System.out.println(testMap.getCapital("Nevada"));
testMap.loadMap("Oregon", "Salem");
System.out.println(testMap.getCapital("Oregon"));

}
}