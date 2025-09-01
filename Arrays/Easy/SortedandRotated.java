package Arrays.Easy;
/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

Input: nums = [3,4,5,1,2]
Output: true

Input: nums = [2,1,3,4]
Output: false
*/

public class SortedandRotated {
    public boolean check(int[] nums){
        // sorted array has one drop where nums[i]>nums[i+1] check if count >1
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){ //circular array so no index out of bound condition to be present
                count+=1;
            }
            if(count>1) return false;
        }
        return true;

    }
    
}
