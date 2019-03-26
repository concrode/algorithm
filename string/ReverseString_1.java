public class ReverseString {
    public void reverseString(char[] s) {
        if(s.length <= 0)
            return;

        char temp;
        for (int i = 0; i < s.length; i ++ ) {
            temp = s[i];
            s[i] = s[s.length - 1 -i];
            s[s.length - 1 - i] = temp;

            if (s.length / 2 <= i + 1) {
                break;
            }
        }
    }

}
