
import java.io.*;
import java.util.*;
public class RecerseWordsinSentence {
	public static void main(String[] args) {
		String s = "Hello World";
		String revWords = ReverseAllWords(s);
		System.out.println(revWords);
		//System.exit(0);
	} 

	public static String ReverseAllWords(String text) {
	    int lindex = 0;
	    int len = text.length() - 1;
	    char[] textCharArray2 = text.toCharArray();
	    if (len > 1) {
		
	        //reverse complete string
	        text = ReverseString(textCharArray2, 0, len);
		    textCharArray2 = text.toCharArray();

	        //reverse each word
	        for (int rindex = 0; rindex <= len; rindex++) {
	            if (rindex == len || textCharArray2[rindex] == ' ') {
	            	text = ReverseString(textCharArray2, lindex, rindex);
	            	//text = text + " ";
	                lindex = rindex + 1;
	            }
	        }
	    }
		//String str = new String(text);
	    return text;
	}

	public static String ReverseString(char[] textCharArray, int begin, int end) {
		//char[] charArray = new char[textCharArray.length];
		//char[] inputCharArray = s.toCharArray();
	//	int len = textCharArray.length - 1;
	    while (begin < end) {
	        char tempc = textCharArray[begin];
	        textCharArray[begin++] = textCharArray[end];
	        textCharArray[end--] = tempc;
	    }
		String str = new String(textCharArray);
		//str = str + ' ';
	    return str;
	}

}
