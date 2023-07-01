import java.util.Stack;

public class InfixToPostfix {
    private static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    public static String convertToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid expression";
                }

                stack.pop();
            }
            
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid expression";
            }
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }
    public static void main(String[] args) {
        String infixExpression = "A*BU+C/D";
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}

