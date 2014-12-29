package Final;

public class SwitchDemo {
			private String monthName = null;
			private int[] mnum = {1,2,3,4,5,6,7,8,9,10,11,12};
			
			public void showMonth(){
				for(int num: mnum){
					//whatMonth(num);
					System.out.println(whatMonth(num));
				}
			}
			
			public String whatMonth(int monthNum) {
				switch (monthNum) {
					case 1: monthName = "January";
					break;
					case 2: monthName = "February";
					break;
					case 3: monthName = "March";
					break;
					case 4: monthName = "April";
					break;
					case 5: monthName = "May";
					break;
					case 6: monthName = "June";
					break;
					case 7: monthName = "July";
					break;
					case 8: monthName = "August";
					break;
					case 9: monthName = "September";
					break;
					case 10: monthName = "October";
					break;
					case 11: monthName = "November";
					break;
					case 12: monthName = "December";
					break;
					
					default: monthName = "Invalid Month";
					break;
				}
				return monthName;
			}
			public static void main(String[] args) {
				SwitchDemo sDemo1 = new SwitchDemo();
				String month = sDemo1.whatMonth(2);
				System.out.println(month);   //February		

				String month2 = sDemo1.whatMonth(12);
				System.out.println(month2);   //December
				
				sDemo1.showMonth();
			}
		}


