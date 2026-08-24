class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int sum=0;
        int[] prefix = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            prefix[i] = sum;
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left=0;
            int right=prefix.length-1;
            int count=0;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(prefix[mid] <= queries[i]){
                    count = mid+1;
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}