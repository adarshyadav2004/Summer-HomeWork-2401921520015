public class FirstUniqueCharacterinaString {
    class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        //count  frq
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        // check towards left hand side
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
    
}
