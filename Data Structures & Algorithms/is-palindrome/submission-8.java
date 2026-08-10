class Solution {
    public boolean isPalindrome(String s) {
        String original = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equals(reverse)){
            return true;
        }
        else {
            return false;
        }
    }
}
