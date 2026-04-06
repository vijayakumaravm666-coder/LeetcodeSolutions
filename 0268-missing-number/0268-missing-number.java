import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int result=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
       
        return nums.length;
        
    }
}