/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Syntax
 * Lecture  : http://youtu.be/kpLko7wWIaM
 * Tutorial : http://youtu.be/AZwE4lfLfz8
 * License  : None.  Do with it as you wish! :)
 */

public class bedmas {
	public static void main(String[] args) {
		int total = 5 * 6 / ((4 + 2) - 1 * 9);
		
		String msg = "total: ";
		String msg2 = " - ";
		System.out.println(msg + msg2 + total);
	}
}
