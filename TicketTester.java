/*
 * [Dale] Yan Lin
 */

package Final;

public class TicketTester {
	
	public static void main(String[] args) {
		
		Concert con = new Concert();
		con.setHallName("Bill Graham");
		con.setAisle("Upper");
		con.setRow(1);

		System.out.print(con.getHallName());
		System.out.print(con.getAisle());
		System.out.print(con.getRow());
		
		SFConcert sfcon = new SFConcert();
		sfcon.setHallName("Regency");
		sfcon.setAisle("Lower");
		sfcon.setRow(2);
		sfcon.setSection('a');
		sfcon.setPrice(90);
		sfcon.setPrice(110, "VIP");
		System.out.print(sfcon.getAisle());
		System.out.print(sfcon.getHallName());
		System.out.print(sfcon.getPrice());
		System.out.print(sfcon.getTicketName());
		
	}

}
