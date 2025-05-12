package BinarySearch;

class Solution {
    public int lowerBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;  
    }
}
