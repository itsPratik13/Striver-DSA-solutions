package Arrays.Easy;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans=0; // as xor is commutative ie 1^3^3^5^5=1 
        for(int i=0;i<nums.length-1;i++){
           ans=ans^nums[i];
        }
        return ans;

    }

}
