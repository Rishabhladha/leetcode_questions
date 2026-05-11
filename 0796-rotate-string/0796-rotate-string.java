class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: Check length (O(1))
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Step 2: Check if goal is a substring of (s + s)
        return (s + s).contains(goal);
    }
}