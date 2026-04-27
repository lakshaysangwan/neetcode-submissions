class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (j > i) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && j > i) i++;
            while (!Character.isLetterOrDigit(s.charAt(j)) && j > i) j--;
            if (!Objects.equals(s.charAt(i), s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
