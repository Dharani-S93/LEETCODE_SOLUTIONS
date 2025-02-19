import java.util.*;

class Solution {
    public static String getHappyString(int n, int k) {
        List<String> s = new ArrayList<>();
        generateHappyStrings(n, "", s);
                if (k > s.size()) {
            return "";
        }
        return s.get(k - 1); 
    }
    
    private static void generateHappyStrings(int n, String cur, List<String> s) {
        if (cur.length() == n) {
            s.add(cur);
            return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (cur.isEmpty() || cur.charAt(cur.length() - 1) != ch) {
                generateHappyStrings(n, cur + ch, s);
            }
        }
    }

}