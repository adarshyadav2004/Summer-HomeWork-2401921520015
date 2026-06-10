import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();     
        int m=p.length(); 
        List<Integer>list=new ArrayList<>();
        if(m>n){
            return list;
        }
        int [] Scount = new int[26];  
        int [] Pcount = new int[26];  
        //intialize first window
        for(int i=0;i<m;i++){
            Scount[s.charAt(i)-'a']++;
            Pcount[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(Scount,Pcount)){
            list.add(0);
        
        }
        for(int i=1;i<=n-m;i++){
            int prev=s.charAt(i-1)-'a';
            int next=s.charAt(i+m-1)-'a';
            Scount[prev]--;
            Scount[next]++;
            if(Arrays.equals(Scount,Pcount)){
                list.add(i);
            }
        }
        return list;

    }
}