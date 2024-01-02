class Solution {
    public String mergeAlternately(String word1, String word2) {
        var res = new StringBuilder();
        var firstP = 0;
        var secondP = 0;
        var n = word1.length();
        var m = word2.length();
        while (firstP < n || secondP < m) {
            if (firstP < n) {
                res.append(word1.charAt(firstP));
                firstP++;
            }
            if (secondP < m) {
                res.append(word2.charAt(secondP));
                secondP++;
            }
        }
        return res.toString();
    }
}