class Solution {
    public int singleNonDuplicate(int[] nums) {
            int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
        //  int n = nums.length;


        // // XOR all the elements:
        // int xorr = 0;
        // for (int i = 0; i < n; i++) {
        //     xorr = xorr ^ nums[i];
        // }
        // return xorr;
        
        //  using linear search
        // for(int i = 0; i < nums.length - 1; i += 2) {
        //     if(nums[i] != nums[i+1]) {
        //         return nums[i];
        //     }
        // }
        
        // return nums[nums.length - 1];
    }
}