package Arrays.Easy;

import java.util.*;

/*Given an array of integers nums, return the value of the 2nd largest element in the array . if not present return -1*/
class SecondLargestElement {
    public int secondlargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondmax=max; // before updating new value to max assign old value 
                max=nums[i];
                
            }
            else if(nums[i]<max && nums[i]>secondmax){
               nums[i]=secondmax;
            }

        }
        if(secondmax==Integer.MIN_VALUE){
            return -1;
        }
        return secondmax;

    }
}