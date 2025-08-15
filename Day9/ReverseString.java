public class ReverseString {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<=j;i++,j--){
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
        }
    }
}
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]