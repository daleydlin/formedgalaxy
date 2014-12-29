/* (Dale) Yan Lin
 * Last Modified 12/08/2014
 */

package week12;
import java.text.DecimalFormat;
import java.util.*;

public class GradesReporter {
	public ArrayList loadLetterGrades(){				//create method loadlettergrades. 
	
	ArrayList<String> letterGrade = new ArrayList();			//create and intialize arraylist Lettergrade. 
	
	for(int index3 = 0; index3 <10; index3++){			//for loop for index 0-10 
		letterGrade.add("F");							//add letter grade F
	}
 
	for(int index4 = 10; index4 <20; index4++){					//for loop for index 11-20 
		letterGrade.add("D");									//add letter grade D.
	}
	
	for(int index5 = 20; index5 <30; index5++){				//for loop for index 21-30 
		letterGrade.add("C");								//add letter grade C.
	}

	for(int index6 = 30; index6 <40; index6++){				//for loop for index 31-40
		letterGrade.add("B");								//add letter grade B. 
	}

	for(int index7 = 40; index7 <51; index7++){					//for loop for index 41-50
		letterGrade.add("A");									//add letter grade A. 
	}
	return letterGrade;
	}

	public void gradeReporter(HashMap<String, Integer> hMap, ArrayList<String> letterGrade,ArrayList<String> listid, ArrayList<String> listname){
		int gradenum = 0;
		int numbergrade =0;
		Set<String> iDs = hMap.keySet();
		for (String ids : iDs) {
			gradenum = (int) hMap.get(ids);
			numbergrade = (int) hMap.get(ids);
			numbergrade=numbergrade+50;
			System.out.print(ids + "\t"+ listname.get(listid.indexOf(ids)) +"\t" + numbergrade+ "\t" + letterGrade.get(gradenum)+"\n");
		}
		}

	public void failingGrades(HashMap<String, Integer> hMap, ArrayList<String> letterGrade,ArrayList<String> listid, ArrayList<String> listname){
		int gradenum = 0;
		int numbergrade =0;
		double totalgrade=0;
		int counter=0;
		Set<String> iDs = hMap.keySet();
		System.out.print("\nFailling Grades: \n\n");
		for (String ids : iDs) {
			gradenum = (int) hMap.get(ids);
			numbergrade = (int) hMap.get(ids);
			numbergrade=numbergrade+50;
			if(letterGrade.get(gradenum).equals("F")){
				System.out.print(listname.get(listid.indexOf(ids)) +"\t" + numbergrade+"\n");
				totalgrade=totalgrade+numbergrade;
				counter++;
			}
		}
		if(counter!=0){
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(1);
		System.out.println("Average failing grade is: "+df.format(totalgrade/counter));
		}
		else{
		System.out.print("Average failing grade is: 0.0");
		}
	
}
}
