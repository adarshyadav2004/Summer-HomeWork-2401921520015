    class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr=nums.length-1;
        while(start<=end){
            int stsq=nums[start]*nums[start];//start ka square
            int endsq=nums[end]*nums[end];//end ka square
            if(stsq>endsq){
                ans[ptr]=stsq;
                start++;
            }
            else{
                ans[ptr]=endsq;
                end--;          
                  }
                  ptr--;
        }
        return ans;
    }
    }

