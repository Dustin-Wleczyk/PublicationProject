/**
 * This class is for magazine objects
 * 
 * Name: Dustin Wleczyk
 * LSU ID: 891888894
 * Lab TA: Mikayla Morrow
 * 
 * 
 * @source 2/11/2020
 * @author dustin251
 *
 */


public class Magazine extends Publication {
	private String publisher;
	
	public Magazine(String publisher, String title, String genre, int edition, int year) {
		super(title, genre, edition, year);
		this.publisher = publisher;
	}
	
	/**
	 * This method overrides the superclass to include unique behavior for magazine object
	 * Created: 2/11/2021
	 * Author: Dustin Wleczyk
	 */
	
	@Override
	public void printInfo() {
		System.out.printf("%s. Edition (%d) published in %d.\n", title, edition, year);
		System.out.printf("%s magazine by %s\n", genre, publisher);
		printFooter();
	}
}
