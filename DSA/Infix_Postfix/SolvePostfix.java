package DSA.Infix_Postfix;

import java.util.Stack;

public class SolvePostfix {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        String str = "23+4-";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                Integer x = str.charAt(i) - 48;
                st.push(x);
            }
            if (str.charAt(i) == '+') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v2 + v1;
                st.push(res);
            } else if (str.charAt(i) == '-') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v2 - v1;
                st.push(res);
            } else if (str.charAt(i) == '*') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v2 * v1;
                st.push(res);
            } else if (str.charAt(i) == '/') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v2 / v1;
                st.push(res);
            }
        }
        System.out.println(st);
    }
}
