import java.util.*;
public class longestsubstring {
  public int lengthOfLongestSubstring(String st) {
    int left=0;
    int maxl=0;
    Set<Character> s=new HashSet<>();
    for(int r=0;r<st.length();r++){
        while(s.contains(st.charAt(r))){
            s.remove(st.charAt(left));
            left++;
        }
        s.add(st.charAt(r));
        maxl=Math.max(maxl,r-left+1);
    }
    return maxl;
  }
}
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.