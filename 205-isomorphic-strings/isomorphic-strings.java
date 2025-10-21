import java.util.Arrays;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        Arrays.fill(m1, -1);
        Arrays.fill(m2, -1);
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = t.charAt(i);
            if (m1[a] == -1 && m2[b] == -1) {
                m1[a] = b;
                m2[b] = a;
            } else if (m1[a] != b || m2[b] != a) {
                return false;
            }
        }
        return true;
    }
}
