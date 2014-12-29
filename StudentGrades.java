/* (Dale) Yan Lin
 * Last Modified 12/08/2014
 */

package week12;
import java.util.*;

public class StudentGrades {
	
	private String studentid;				//declare String studentid
	private int studentgrade;				//declare int studentgrade
	HashMap<String, Integer> hMap = new HashMap<String, Integer>();			//declare hashmap hMap.

	public void ScanforGrades() {
		Scanner scanner = new Scanner(System.in);	//Initialize scanner. 
		while(true){								//loop to continue to ask for use input
			
			System.out.println("Enter id: ");		//print enter it
			studentid = scanner.next();				//used to get the id. 
			
			if(studentid.equals("quit") || studentid.equals("end")){	//if user input equals quit or end, break.
			System.out.print("\n");								//print new line
			break;												//break out of while loop.
			} 												
			
			System.out.println("Enter grade: "); 		//print enter grade.
			studentgrade = scanner.nextInt()-50;		//used to get grade as and int, minus 50 to get actual index
			
			hMap.put(studentid, studentgrade); 			//used to add to hashmap 

		}
	}
}
