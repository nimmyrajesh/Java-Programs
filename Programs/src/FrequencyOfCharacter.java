
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class FrequencyOfCharacter {
	private static Hashtable<String, Integer> table = new Hashtable<String, Integer>();

	public static void readFile() {

	    //File file = new File("file.txt");
		   String s = "one one one one two two three";

	    try {

	        Scanner sc = new Scanner(s);

	        String words;

	        while (sc.hasNext()) {
	            words = sc.next();
	            words = words.toLowerCase();

	            if (words.length() >= 2) {
	                add(words);
	            }
	        }
	        sc.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void add(String words) {

	    	if (table.containsKey(words)) {
	    		   table.put(words, table.get(words) + 1);
	    		} else {
	    		   table.put(words, 1);
	    		}
	    }

	public static void show() {

	    for (Entry<String, Integer> entry : table.entrySet()) {
	        System.out.println(entry.getKey() + "\t" + entry.getValue());
	    }
	}

	public static void main(String args[]) {

		readFile();
	    show();
	}
}
