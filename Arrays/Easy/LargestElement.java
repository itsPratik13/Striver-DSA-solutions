package Arrays.Easy;
/*Given an array of integers nums, return the value of the largest element in the array */
class Solution {
    public int largestElement(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int max=0;
         for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
         }
         return max;

    
    }
}