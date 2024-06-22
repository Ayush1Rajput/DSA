package DSA.Infix_Postfix;

import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        Stack<Character> st  = new Stack<>();
        String str = "k+l*p";
        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/'){
                st.push(str.charAt(i));
            }
        }
    }
}
