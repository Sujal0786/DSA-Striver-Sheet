class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(input1)); // Output: "fl"
        System.out.println(longestCommonPrefix(input2)); // Output: ""
    }
}
