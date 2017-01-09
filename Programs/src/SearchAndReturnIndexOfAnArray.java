

//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//13578
public class SearchAndReturnIndexOfAnArray {
	public static void main (String[] args) {
		int[] num = {1,3,5,7,8};
	 int index = searchInsert(num, 4);
	 System.out.println(index);
	}
 public static int searchInsert(int[] nums, int target) {
        if(nums==null)
     return -1;
 if(target>nums[nums.length-1]){
     return nums.length;
 }

 int i=0;
 int j=nums.length;

 while(i<j){
     int m=(i+j)/2;
     if(target>nums[m]){
         i=m+1;
     }else{
         j=m;
     }
 }

 return j;
 }

}
