import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String input = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(input);
        System.out.println("Longest substring length: " + result);
    }
}


// output

// String input = "abcabcbb";
// Longest substring length: 3
