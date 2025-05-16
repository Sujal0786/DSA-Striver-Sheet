class Solution {
   public int[] searchRange(int[] nums, int target) {
      int count = 0;
        int[] temp = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (count == 1) {  
                    temp[0] = i;   
                }
                temp[1] = i;  
            }
        }
        return temp;
    }
}
