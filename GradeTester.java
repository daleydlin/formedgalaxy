package week12;

import java.util.*;

public class GradeTester {

	public static void main(String[] args) {
		
		StudentGrades studentgrades = new StudentGrades(); 		// create reference to access studentgrade
		studentgrades.ScanforGrades(); 							//access method Scan for grades.

		ArrayList<String> listid = new ArrayList<String>();					//create arraylist listid
		ArrayList<String> listname = new ArrayList<String>();				//create arraylist listname

		StudentInfo studentsinfo = new StudentInfo();		//instantiate StudentInfo

		listid = studentsinfo.loadId();						//catch studentinfo from loadId method
		listname = studentsinfo.loadNames();				//catch studentinfo from loadNames method
		
		GradesReporter gradereport = new GradesReporter();			//intiatilize gradereporter as an object. 
		
		ArrayList<String> letterGrade = new ArrayList<String>();	//create arraylist letterGrade
		letterGrade = gradereport.loadLetterGrades();				//load letter grades
		
		gradereport.gradeReporter(studentgrades.hMap, letterGrade, listid, listname);			//access gradereporter pass hMap, lettergrade, listid, listname
		gradereport.failingGrades(studentgrades.hMap, letterGrade, listid, listname);			//access failing grades pass hMap, lettergrade, listid, listname
		

	}
}
