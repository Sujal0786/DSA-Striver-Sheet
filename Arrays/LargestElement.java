import java.util.*;
class Solution {
    public int largestElement(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       return nums[n-1];
    }
}