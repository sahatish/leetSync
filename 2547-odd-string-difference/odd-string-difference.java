import java.util.Arrays;

class Solution {
    public String oddString(String[] words) {

        int[] d0 = getDifference(words[0]);
        int[] d1 = getDifference(words[1]);
        int[] d2 = getDifference(words[2]);

        if (!Arrays.equals(d0, d1)) {
            return Arrays.equals(d0, d2) ? words[1] : words[0];
        }

        for (int i = 2; i < words.length; i++) {
            if (!Arrays.equals(d0, getDifference(words[i]))) {
                return words[i];
            }
        }

        return "";
    }

    private int[] getDifference(String word) {

        int[] diff = new int[word.length() - 1];

        for (int i = 0; i < word.length() - 1; i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }

        return diff;
    }
}