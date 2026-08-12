import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder first = new StringBuilder();
        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < count[i] / 2; j++) {
                first.append((char)('a' + i));
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(first);
        if (s.length() % 2 == 1) {
            for (int i = 0; i < 26; i++) {
                if (count[i] % 2 == 1) {
                    ans.append((char)('a' + i));
                    break;
                }
            }
        }
        ans.append(new StringBuilder(first).reverse());
        return ans.toString();
    }
}