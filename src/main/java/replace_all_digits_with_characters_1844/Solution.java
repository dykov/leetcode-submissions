package replace_all_digits_with_characters_1844;

class Solution {
    public String replaceDigits(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            final char curr = chars[i];
            if (curr >= '0' && curr <= '9') {
                chars[i] = shift(chars[i - 1], curr - 48);
            }
        }
        return String.valueOf(chars);
    }

    private char shift(final char prevChar, final int num) {
        return (char) (prevChar + num);
    }
}