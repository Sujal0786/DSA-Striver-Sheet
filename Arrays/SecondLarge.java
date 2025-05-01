class Solution {
    public int secondLargestElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                slarge = large;
                large = nums[i];
            } else if (nums[i] < large && nums[i] > slarge) {
                slarge = nums[i];
            }
        }
        if (slarge == Integer.MIN_VALUE) {
            return -1;
        }

        return slarge;
    }
}
