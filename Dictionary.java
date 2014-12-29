/*
 * [Dale] Yan Lin
 */

package Final;

public class Dictionary {

	String table;
	String chair;
	String sofa;
	String television;
	String xboxone;
	
	public String dictionary(String word){
		if(word.equals("table")){
			word="noun. A table has four legs and is used to eat or do work on";
		}
		
		else if(word.equals("chair")){
			word="noun. A chair has 4 legs and is used to sit on with a table";
		}
		
		else if(word.equals("sofa")){
			word="noun. A sofa is a soft comfortable chair that is usually in front of a tv";
		}
		
		else if(word.equals("television")){
			word="noun. A television is used to view broadcasted and cable television";
		}
		
		else if(word.equals("xboxone")){
			word="non. A xboxone is used to play video games on and is hooked up to a tv and usually played on the sofa";
		}
		
		else{
			System.out.print("Try another word in the dictionary");
		}
		return word;
	}
	
	public static void main(String[] args) {
	String definition;
	Dictionary dict = new Dictionary();
	definition = dict.dictionary("xboxone");
	System.out.print(definition);
	}
}
