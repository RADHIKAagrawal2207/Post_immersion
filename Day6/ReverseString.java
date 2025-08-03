package Post_immersion.Day6;

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<(s.length/2);i++,j--){
            char left=s[i];
            s[i]=s[j];
            s[j]=left;
        }
    }
}
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]