class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxCount=0;
       int current=0;
       for(int num : nums){
        if(num == 1){
            current++;
            if(current>maxCount){
                maxCount=current;
            }
        }else{
            current=0;
        }
       }
       return maxCount;
    }
}