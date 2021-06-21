package length_of_last_word_58;

class Solution {
    /*
    * Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
    * Memory Usage: 37 MB, less than 85.75% of Java online submissions for Length of Last Word.
    */
    public int lengthOfLastWord(String s) {
        final String trimed = s.trim();
        final int lastWordFirstCharIndex = trimed.lastIndexOf(' ') + 1;
        return trimed.length() - lastWordFirstCharIndex;
    }
}