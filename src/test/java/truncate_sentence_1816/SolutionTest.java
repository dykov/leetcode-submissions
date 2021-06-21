package truncate_sentence_1816;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void truncateSentenceTest1() {
        final String input = "Hello how are you Contestant";
        final int k = 4;

        final String actual = solution.truncateSentence(input, k);
        final String expected = "Hello how are you";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void truncateSentenceTest2() {
        final String input = "What is the solution to this problem";
        final int k = 4;

        final String actual = solution.truncateSentence(input, k);
        final String expected = "What is the solution";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void truncateSentenceTest3() {
        final String input = "chopper is not a tanuki";
        final int k = 5;

        final String actual = solution.truncateSentence(input, k);
        final String expected = "chopper is not a tanuki";

        Assertions.assertEquals(expected, actual);
    }
}