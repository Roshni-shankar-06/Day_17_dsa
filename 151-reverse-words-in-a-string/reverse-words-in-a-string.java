class Solution {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces and split by any sequence of spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        // Iterate backwards through the array of words
      
