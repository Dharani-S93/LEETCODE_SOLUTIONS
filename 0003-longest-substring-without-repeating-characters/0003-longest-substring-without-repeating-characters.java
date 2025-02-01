class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        int maxLength = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
                        start = Math.max(start, lastIndex[currentChar]);
            maxLength = Math.max(maxLength, end - start + 1);
            lastIndex[currentChar] = end + 1;
        }

        return maxLength;
    }
}