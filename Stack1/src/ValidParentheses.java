import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' ||  s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {

                if (stack.isEmpty()) {
                    return false;
                } else if ((stack.peek() == '(' && s.charAt(i) != ')') || (stack.peek() == '[' && s.charAt(i) != ']') || (stack.peek() == '{' && s.charAt(i) != '}')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return   stack.isEmpty();
    }
}
