class Solution {
    public int findPeakElement(int[] nums) {
       int n=nums.length;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]<nums[i-1]){
                return i-1;
            } 
        }
        return n-1;
         
    }
}
