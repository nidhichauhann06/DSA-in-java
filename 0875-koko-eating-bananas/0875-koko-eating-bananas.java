class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high=0;
        for(int pile:piles){
            high = Math.max(high,pile);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            long totalHours =0;
            for(int pile:piles){
                totalHours += (pile+mid-1)/mid;
            }//agar totalhours,h se bada hai to eat faster
            if(totalHours<=h){
                high=mid;
            }else{
                low=mid+1;
            }
                    } 
                    return low;       
    }
}