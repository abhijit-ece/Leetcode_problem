class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int x = sum % 26;
            char ch = (char) ('z' - x);
            ans += ch;
        }
        return ans;
    }
}