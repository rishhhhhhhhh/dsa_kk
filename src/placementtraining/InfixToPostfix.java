package placementtraining;

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

    // Function to convert infix expression to postfix expression
    public static String convertToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            // If the character is an operand, append it to the postfix expression
            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            }
            // If the character is an opening parenthesis, push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If the character is a closing parenthesis, pop operators from the stack and append them to the postfix expression until an opening parenthesis is encountered
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    // Invalid expression (mismatched parentheses)
                    return "Invalid expression";
                }
                // Remove the opening parenthesis from the stack
                stack.pop();
            }
            // If the character is an operator, pop operators from the stack and append them to the postfix expression until an operator with lower precedence is encountered
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop any remaining operators from the stack and append them to the postfix expression
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                // Invalid expression (mismatched parentheses)
                return "Invalid expression";
            }
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A+B*C-(D/E+F*G)";
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}

