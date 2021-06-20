package truncate_sentence_1816;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    /*
    Runtime: 1 ms, faster than 75.34% of Java online submissions for Truncate Sentence.
    Memory Usage: 37.5 MB, less than 67.33% of Java online submissions for Truncate Sentence.
     */
    public String truncateSentence(String s, int k) {
        final String[] split = s.split(" ", k + 1);
        final String[] copied = Arrays.copyOf(split, k);
        return String.join(" ", copied);
    }

    /*
    Runtime: 3 ms, faster than 30.92% of Java online submissions for Truncate Sentence.
    Memory Usage: 37.7 MB, less than 52.07% of Java online submissions for Truncate Sentence.
    */
    public String truncateSentence_stream(String s, int k) {
        return Arrays.stream(s.split(" ", k + 1))
            .limit(k)
            .collect(Collectors.joining(" "));
    }
}