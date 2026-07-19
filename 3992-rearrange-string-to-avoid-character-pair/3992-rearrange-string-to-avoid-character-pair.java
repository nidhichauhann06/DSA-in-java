class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder yChars = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();
        StringBuilder xChars = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == y){
                yChars.append(ch);
            }else if(ch == x){
                xChars.append(ch);
            }else{
                otherChars.append(ch);
            }
        }
        return yChars.toString()+otherChars.toString()+xChars.toString();
    }
}