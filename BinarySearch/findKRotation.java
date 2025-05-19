import java.util.*;
class Solution {
    public int findKRotation(ArrayList<Integer> nums) {

        int minValue = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < minValue) {

                return i;
            }
        }

        return 0;
    }
}
