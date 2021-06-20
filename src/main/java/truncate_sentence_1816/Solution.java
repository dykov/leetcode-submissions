package truncate_sentence_1816;

import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {
        final String[] split = s.split(" ", k + 1);
        final String[] copied = Arrays.copyOf(split, k);
        return String.join(" ", copied);
    }
}