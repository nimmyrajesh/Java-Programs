
import java.io.*;
import java.util.*;
//import org.apache.commons.lang3.math.NumberUtils;

public class IntegerToString {
	    public static void main(String[] args) {
	        String s = "1234";
	        int answer = myAtoi(s);
	        System.out.println(answer);
	    }
	    public static int myAtoi(String str) {
	    	int  res =0;
	        
	        if (isNumeric(str.trim()))
	        {
	            if(str.trim() != null && !str.isEmpty())
	                res =Integer.parseInt(str);
	        }
	         return res ;
	    }
	    
	    public static boolean isNumeric(String str)  
	    {  
	      try  
	      {  
	        double d = Double.parseDouble(str);  
	      }  
	      catch(NumberFormatException nfe)  
	      {  
	        return false;  
	      }  
	      return true;  
	    }
}

