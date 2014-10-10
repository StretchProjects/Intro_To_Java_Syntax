/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Syntax
 * Lecture  : 
 * Tutorial : 
 * License  : None.  Do with it as you wish! :)
 */

public class Main {

	public static void main (String[] args) {
		// This holds the number of views from John
		int viewsByJohn;
		viewsByJohn = 8;
		
		int viewsByAmy = 6;
		
//		int total = viewsByJohn / viewsByAmy;
		
		boolean isEven = 7 % 2 == 0;
		
		/*
		 * Many lines
		 * of comments
		 */
		float averageRating;
		averageRating = 5.5f;
		/*
		averageRating = 8.5f;
		*/
		String message1 = "Views by John: ";
		String message2 = "Average rating: ";
		String message3 = "Is subscribed? ";

		boolean isSubscribed = true;
		
		System.out.println(message1 + viewsByJohn + "\n"
				+ message2 + averageRating + "\n"
				+ message3 + isSubscribed);
		
		System.out.println(isEven);
	}
}
