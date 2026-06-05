
public class ValidPalindrome {
    class Solution {
    boolean isAlphaNum(char ch){
            if((ch>='0' && ch<='9')|| (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')){
                return true;
            }
            return false;
        }
    public boolean isPalindrome(String s) {
        int start=0;int end=s.length()-1;
        while(start<end){
            if(!isAlphaNum(s.charAt(start))){
                start++;continue;
            } 
            if(!isAlphaNum(s.charAt(end))){
                end--; continue;
            }    
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;end--;
        }
        return true;
    }
}    
}
