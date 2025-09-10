package Arrays.Easy;

public class MaxConsecutiveOnes {
    /*
     * Given a binary array nums, return the maximum number of consecutive 1's in
     * the array.
     * 
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 ){
               count=count+1;
               max=Math.max(count,max);
            }
            if(nums[i]==0){
                count=0;
            }


        }
        return max;
        
    }

}
