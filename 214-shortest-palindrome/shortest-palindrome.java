class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        String rev = new StringBuilder(s).reverse().toString();
       
