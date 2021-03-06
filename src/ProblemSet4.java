/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
	}

	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	// your method signature here
	public String surroundMe(String out, String in) {
		if (out == null || in == null) {
			return null;
		}
		if (out.length() != 4) {
			return null;
			}
		if (in.length() != 3) {
			return null;
		}
		return out.substring(0, 2) + in + out.substring(2, 4);
	}
	
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	// your method signature here
	public String endsMeet(String str, int n) {
		if (n <= 0) {
			return null;
		}
		if (str == null) {
			return null;
		}
		if (str.length() < 1 || str.length() > 10) {
			return null;
		}
		if (n > str.length()) {
			return null;
		}
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}
	
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	// your method signature here
	public String middleMan(String str) {
		if (str == null) {
			return null;
		}
		if (str.length() % 2 == 0) {
			return null;
		}
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
	}
	
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	// your method signature here
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		if (str.length() < 1) {
			return null;
		}
		String newString = new String(); 
		for (int y = 0; y < str.length(); y++) {
			newString += str.charAt(y) + "" + str.charAt(y); 
		}
		return newString;
	}
	
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */
	
	// your method signature here
	public boolean centered(String str, String target) {
		if (str == null || target == null) {
			return false;
		}
		if (target.length() != 3) {
			return false;
		}
		return (str.substring((str.length() / 2) - 1, (str.length() / 2) + 2).equals(target));
	}
	
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	// your method signature here
	public int upOrDown (double number, char operation) {
		switch (operation) {
			case 'r':
				return (int) Math.round(number);
			case 'f':
				return (int) Math.floor(number);
			case 'c':
				return (int) Math.ceil(number);
			default:
				return -1;
		}
	}
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	// your method signature here
	public int countMe(String text, char end) {
		int count = 0;
		String check; 
		if (text == null || "" + end == null) {
			return -1;
		}
		if (text.length() == 0 || Character.isLetter(end) == false) {
			return -1;
		} 
		for (int i = 0; i < text.length(); i++) {
			if (i == (text.length() -1)) {
				check = text.substring(i);
			}
			else {
				check = text.substring(i, i + 2);
			}
			if (check.equals(end + " ") || check.equals(end + "\n")) {
				count++;
			}
		}
			return count;
	}
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	// your method signature here
	public boolean isNotEqual(String str) {
		int isCheck = 0;
		int notCheck = 0; 
		if (str == null) {
			return false;
		}
		if (str.length() == 0) {
			return false;
		}
		for (int q = 0; q < str.length() - 1; q++) {
			if (str.substring(q, q + 2).equals("is")) {
				isCheck++;
			}
			else if (q < str.length() - 2) {
				if (str.substring(q, q + 3).equals("not")) {
					notCheck++;
				}
			}
		}
		if (isCheck == notCheck) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	
	// your method signature here
	public int triplets(String str) {
		int tripCheck = 0;
		if (str == null) {
			return -1;
		}
		if (str.length() == 0) {
			return -1;
		}
		for (int v = 0; v < str.length() - 2; v++) {
			if (str.charAt(v) == str.charAt(v + 1)) {
				if (str.charAt(v) == str.charAt(v + 2)) {
					tripCheck++;
				}
			}
			else if (!Character.isAlphabetic(str.charAt(v))) {
				return -1;
			}
		}
		return tripCheck;
	}
	
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifcations are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	// your method signature here
	public int addMe(String str, boolean digits) {
		int sum = 0;
		if (str == null) {
			return -1;
		}
		if (digits) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					sum += Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else { 
			int check = 0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					check *= 10;
					check += Character.getNumericValue(str.charAt(i));;
				}
				else if (!Character.isAlphabetic(str.charAt(i))) {
					return -1;
				}
				else {
					sum += check;
					check = 0;
				}
			}
			sum += check;
		}
		return sum;
	}
}
