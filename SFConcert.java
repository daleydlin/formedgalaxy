/*
 * [Dale] Yan Lin
 */
package Final;

import week13.Ticket;

public class SFConcert extends Concert{

		private double sfPrice;
		private char section;
		private final double TAX = 0.0925;
		private String name;
		
		public char getSection() {
			return section;
		}

		public void setSection(char section) {
			this.section = section;
		}

		public void setPrice(double price) {
			sfPrice = price + (price*TAX);
		}
		
		public void setPrice(double price, String ticketname) {
			sfPrice = price + (price*TAX);
			name = ticketname;
		}

		public double getPrice() {
			return sfPrice;
		}
		
		public String getTicketName(){
			return name;
		}
		
		
	}

	
