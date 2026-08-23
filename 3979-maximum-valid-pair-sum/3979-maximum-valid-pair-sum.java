class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int maxElement = nums[0];
            for(int j=k;j<nums.length;j++){
                if(nums[j-k] > maxElement){
                    maxElement = nums [j-k];
                }
                int sum = maxElement + nums[j];
                if(sum >maxSum){
                    maxSum = sum;
                }
            }
            
        return maxSum;
        
    }
}