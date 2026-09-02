class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA =0;
        int sumB =0;
        for(int x :aliceSizes){
            sumA += x;
        }
        for(int x :bobSizes){
            sumB += x;
        }
        int difference = (sumA-sumB)/2;
        HashSet<Integer> bob = new HashSet<>();
        for(int x : bobSizes){
            bob.add(x);
        }
        for(int x : aliceSizes){
            int required = x - difference;
            if(bob.contains(required)){
                return new int[]{x,required};
            }
        }
        return new int[]{};
        
    }
}