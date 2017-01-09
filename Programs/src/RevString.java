
import java.io.*;
import java.util.*;

public class RevString {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] charArray = new char[s.length()];
		char[] inputCharArray = s.toCharArray();
		int len = s.length() - 1;
		for(int i=0; i<=len; i++) {
			charArray[i] = inputCharArray[len-i];
		}
		
		System.out.println(charArray);
	}
}

/*
 * Test case for reversing a string
1.What happens if string is null
2.what if string has same characters
3.what if string is a palidrome.
4.what is the longest length of the string func can accept.
5.can this reverse integers?
6.If it fails due to some reason how does it cope up?
7.what if the end of string is not terminated by NULL character ?
1) An empty string.
2) String with only one space. Ex: " ".
3) String with multiple spaces in between words.
4) String with spaces at the starting. Single and multiple.
5) String with spaces at the end. Single and multiple.
6) Combinations of step 3 with 4 and 5.
7) String with alphanumeric.
8) Include special characters in step 7.
9) Strings which are palindromes.
10) String with only one character.
11) String with more than 255 characters.
12) String with combinations of uppercase and lowercase letters.
13) String with only special characters.
14) String with only uppercase and only lowercase letters.
15) String with only spaces. more than 2 spaces.
16) String with ASCII characters and with Unicode characters.
17) String with exactly single spaces in between letters.
18) String containing even number of letters in some words and odd number of letters in others.

The internal structure of a C# string is different from a C string. a) It is unicode, as is a 'char' b) It is not null terminated c) It includes many utility functions that in C/C++ you would require for.

How does it get away with no null termination? Simple! Internally a C# String manages a char array. C# arrays are structures, not pointers (as in C/C++). As such, they are aware of their own length. The Null termination in C/C++ is required so that string utility functions like strcmp() are able to detect the end of the string in memory.

The null character does exist in c#.

string content = "This is a message!" + '\0';

This will give you a string that ends with a null terminator. Importantly, the null character is invisible and will not show up in any output. It will show in the debug windows. It will also be present when you convert the string to a byte array (for saving to disk and other IO operations) but if you do Console.WriteLine(content) it will not be visible.

You should understand why you want that null terminator, and why you want to avoid using a loop construct to get what you are after. A null terminated string is fairly useless in c# unless you end up converting to a byte array. Generally you will only do that if you want to send your string to a native method, over a network or to a usb device.

It is also important to be aware of how you are getting your bytes. In C/C++, a char is stored as 1 bytes (8bit) and the encoding is ANSI. In C# the encoding is unicode, it is two bytes (16bit).
 */


/*
 * Java Program to replace a String in place.
 * Since String is Immutable in Java, you cannot reverse
 * the same String, but a new String is get created.
 * This program reverse a string in place using StringBuilder
 */

/* public class Main {

    public static void main(String args[]) {

        String number = "1234";
        System.out.println("original String: " + number);
        String reversed = inPlaceReverse(number);
        System.out.println("reversed String: " + reversed);
    }

    /*
     * Java method to replace a String in place
     */
 /*   public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }

        return builder.toString();
    }
}

*/



