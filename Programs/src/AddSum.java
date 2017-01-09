
import java.util.*;
public class AddSum {
	public static void main(String[] args) { 
		int[] nums = {2,2,3,7,5};
	    int[] indexes = returnIndex(nums, 9);
	    System.out.println(indexes[0]);
	    System.out.println(indexes[1]);
	}
	public static int[] returnIndex(int[] nums, int sum)
	{
    	int[] res = new int[2];
		try
		{
		if(nums == null || nums.length <2)
		{
			return res;
		}
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for(int i=0; i<=nums.length; i++)
		{
			// 9-2 = 7
			//9-3 = 6
			//9-7 = 2
			int diff = sum - nums[i];
			//if difference is not in hash, store the number in array and its index
			if(hash.containsKey(diff))
			{
				res[0] = hash.get(diff);
				res[1] = i + 1;		
				return res;
				
			}
			else
			{
				//put the number and index to hash table
				//2, 1
				//3, 2
				hash.put(nums[i], i+1);
			}
		}
		}
        catch (ArrayIndexOutOfBoundsException exception)
        {  
            System.out.println("Error processing file: " + exception);
        }
		return res;    
	}

}
