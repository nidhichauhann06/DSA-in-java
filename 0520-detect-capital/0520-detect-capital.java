class Solution {
    public boolean detectCapitalUse(String word) {
        int count =0;
        for(char ch : word.toCharArray()){
            if(ch>='A'&& ch<='Z'){
                count++;
            }
            
        }
        if(word.length() == count || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        return false;


        
    }
}