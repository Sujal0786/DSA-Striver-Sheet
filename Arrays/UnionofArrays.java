import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums1) {
            s.add(num);
        }
        for (int num : nums2) {
            s.add(num);
        }
        int[] result = new int[s.size()];
        int i = 0;
        for (int num : s) {
            result[i++] = num;
        }
        return result;
    }
}
