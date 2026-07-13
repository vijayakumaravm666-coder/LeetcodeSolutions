class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int deff=target-nums[i];
            if(map.containsKey(deff)){
                return new int[]{map.get(deff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}