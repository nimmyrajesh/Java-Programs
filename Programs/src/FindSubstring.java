
public class FindSubstring {
	public static void main(String[] args) {
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int start = 0;
		int count = 0;

		while (start != -1) {
			//start searching from left to right based on "start" index
		    start = str.indexOf(findStr,start);

		    if( start != -1) {
		        count++;

		    start += findStr.length();
		}
		}
		System.out.println(count);
	}
}




