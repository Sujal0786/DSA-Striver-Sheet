class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String a = s + s; // should be s + s, not s + goal
        return a.contains(goal);
    }
}
