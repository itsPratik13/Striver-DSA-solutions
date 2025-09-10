package Arrays.Easy;
import java.util.*;

public class FindMissingNumber {
    /*
     * Given an array nums containing n distinct numbers in the range [0, n], return
     * the only number in the range that is missing from the array.
     * 
     */
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0;
        }
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    
    }
}
