public class LongestCommonPrefix {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
        boolean match=true;
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length() || ch!=strs[j].charAt(i)){
                    match=false;
                }
            }
            if(match==false) break;
            else{
                ans.append(ch);
            }

        }
        
        return ans.toString();
    }
}
    
}
