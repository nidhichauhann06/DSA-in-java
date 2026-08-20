class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n-1)/2];
        int left =0;
        int right = n-1;
        int[] answer = new int[k];
        int index =0;
        while(index < k){
            if(Math.abs(arr[left]-median)> Math.abs(arr[right]-median)){
                answer[index] = arr[left];
                index++;
                left++;
            }else{
                answer[index] = arr[right];
                index++;
                right--;
            }
        }
        return answer;

        
    }
}