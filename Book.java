/**
 * This class is for book objects
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



public class Book extends Publication {
	private String author;
	
	public Book(String Author, String Title, String Genre, int Edition, int Year) {
		super(Title, Genre, Edition, Year);
		this.author = Author;
	}
	
	/**
	 * This method overrides the superclass to include unique behavior for book object
	 * Created: 2/11/2021
	 * Author: Dustin Wleczyk
	 */
	@Override
	public void printInfo() {
		System.out.printf("%s. Edition (%d) published in %d.\n", title, edition, year);
		System.out.printf("%s book by %s\n", genre, author);
		printFooter();
	}

}
