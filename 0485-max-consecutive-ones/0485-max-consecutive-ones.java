class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Count =0;
        int maxCount = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] == 1){
                Count++;
                maxCount = Math.max(Count,maxCount);
            }else{
                Count =0;

            }
            
        }
        return maxCount;
    }
}
