/**
 * This is parent class for book info and other similar objects to inherit
 * 
 * Name: Dustin Wleczyk
 * LSU ID: 891888894
 * Lab TA: Mikayla Morrow
 * 
 * 
 * @source 2/11/2020
 * @author dustin251
 */


public class Publication implements Comparable<Publication> {
	protected String title;
	protected String genre;
	protected int edition;
	protected int year;
	
	public Publication(String newTitle, String newGenre, int newEdition, int newYear) {
		title = newTitle;
		genre = newGenre;
		edition = newEdition;
		year = newYear;
	}
	
	/**
	 * This method will print the information about the book
	 * Created: 2/11/2021
	 * Author: Dustin Wleczyk
	 */
	
	public void printInfo() {
		System.out.printf("%s. Edition (%d) published in $d\n", title, edition, year);
	}
	
	/**
	 * This method will print the footer after data has been outputted
	 * Created: 2/11/2021
	 * Author: Dustin Wleczyk
	 */
	
	public void printFooter() {
		System.out.println("All rights reserved!");
		System.out.println("--------------------");
		
	}
	
	/**
	 * This method compares which attribute comes first
	 * Created: 2/11/2021
	 * Author: Dustin Wleczyk
	 * @param compareIt Is the object to compare
	 * @return Will return int either -1, 0, or 1 depending on which comes first
	 */
	
	@Override
	public int compareTo(Publication compareIt) {
		int numToReturn = 0; //By default
		if (genre.compareTo(compareIt.genre) != 0) {
			
			numToReturn = genre.compareTo(compareIt.genre);
			
		} else if (title.compareTo(compareIt.title) != 0) {
			
			numToReturn = title.compareTo(compareIt.title);
			
		} else {
			
			numToReturn = 0; //Both are the same
			
		}
		
		return numToReturn;
	}
	
}
