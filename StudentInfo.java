/* (Dale) Yan Lin
 * Last Modified 12/08/2014
 */


package week12;
import java.util.*;

public class StudentInfo{
	
	private String[] studentid = {"ABC1", "DEF2", "GHI3", "JKL4", "MNO5", "PQR6", "STU7"}; //declare array of Strings
	private String[] studentname = {"Bear Grylls", "Les Stroud", "Joe Teti", "Mick Dodge", "Ruth Hawke", "Dave Canteburry", "Ray Mears"}; //declare array of strings. 

	public ArrayList<String> loadId(){								//create method loadid. 
		ArrayList<String> studentids = new ArrayList<String>();		//Loads listid into the arraylist.
		
		for(int index1 = 0; index1 <studentid.length; index1++){ 	//iterate with standard for loop.
			studentids.add(studentid[index1]);						//Add student ids to array list studentid. 
		}
		return studentids;											//return listid arraylist
	}
	
	public ArrayList<String> loadNames(){						//create method loadnames.
		ArrayList<String> studentnames = new ArrayList<String>(); 	//Loads listname into the arraylist.
		
		for(int index2 = 0; index2 <studentname.length; index2++){		//iterate with stanford for loop. 
			studentnames.add(studentname[index2]);				//add student name to arraylist Listname.  
			}
		return studentnames;									//return listname arraylist
	}

}
