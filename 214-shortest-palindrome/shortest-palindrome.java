class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        int[] lps = new int[temp.length()];
        
        for (int i = 1; i < temp.length(); i++) {
           
