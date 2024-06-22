package DSA.Infix_Postfix;

import java.util.*;

public class SolvePrefix {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();
        String str = "+-234";
        for (int i = str.length()-1; i >=0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                Integer x = str.charAt(i) - 48;
                st.push(x);
            }
            if (str.charAt(i) == '+') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v1 + v2;
                st.push(res);
            } else if (str.charAt(i) == '-') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v1 - v2;
                st.push(res);
            } else if (str.charAt(i) == '*') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v1 * v2;
                st.push(res);
            } else if (str.charAt(i) == '/') {
                Integer v1 = st.pop();
                Integer v2 = st.pop();
                Integer res = v1 / v2;
                st.push(res);
            }
        }
        System.out.println(st);

    }
}
