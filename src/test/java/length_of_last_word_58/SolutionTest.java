package length_of_last_word_58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void lengthOfLastWordTest1() {
        final String input = "Hello World";

        final int actual = solution.lengthOfLastWord(input);
        final int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordTest2() {
        final String input = " ";

        final int actual = solution.lengthOfLastWord(input);
        final int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordTest3() {
        final String input = "a ";

        final int actual = solution.lengthOfLastWord(input);
        final int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}