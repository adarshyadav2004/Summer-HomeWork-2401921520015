import java.util.ArrayList;
import java.util.List;
class Solution {
    void helper(List<String> v ,int n,int openbrckt,int closebrckt,String s){
        // BASE CASE: valid combination formed
        if(openbrckt == n && closebrckt== n) {
            v.add(s);
            return;   
        }
       // TRY ADDING "("
        if(openbrckt < n){
          helper(v,n,openbrckt + 1,closebrckt,s+"(");


        }
       //   TRY ADDING ")"
        if(closebrckt<openbrckt){
            helper(v,n,openbrckt,closebrckt + 1,s+")");

        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> v =new ArrayList<>();
        int openbrckt=0;
        int closebrckt=0;
        helper(v,n,openbrckt,closebrckt,"");

        return v;
    }
}