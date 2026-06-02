//package Week 1.Day 2;
import java.util.*;

public class ContainsDuplicate {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
}
}
    
}
