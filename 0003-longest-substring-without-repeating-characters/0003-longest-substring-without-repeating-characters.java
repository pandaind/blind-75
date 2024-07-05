class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> substringSet = new HashSet<>();
        int largestlength = 0;
        int left = 0; // Start of the sliding window

        for (int right = 0; right < s.length(); right++) {
            while (substringSet.contains(s.charAt(right))) {
                // Remove the leftmost character to avoid repetition
                substringSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            substringSet.add(s.charAt(right));
            // Update the maximum length
            largestlength = Math.max(largestlength, right - left + 1);
        }
        return largestlength;
    }
}