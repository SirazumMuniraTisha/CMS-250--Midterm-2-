import java.util.Stack;

public class InfixToPostFix {
    
    // Method to convert infix expression to postfix
    public static String toPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        String[] tokens = infix.split(" "); // Split input to individual token by the whitespace

        for (String token : tokens) {
            char c = token.charAt(0);

            // If the token is an operand (number/variable), add it to postfix expression
            
            
            // If the token is an opening parenthesis '(', push it to stack
           
            
            // If the token is a closing parenthesis ')', pop until '(' is found
            
            
            // If the token is an operator...
            /*Check if the stack is not empty (!stack.isEmpty())
			**Compare the precedence of the current operator (c) with 
			*	the operator at the top of the stack (stack.peek())
			**If the top operator has equal or higher precedence, 
			*	pop it from the stack and append it to the postfix expression.
			**Repeat this step until:
			*	The stack is empty or
			*	The top of the stack has a lower precedence than c.
			** Push the current operator (c) onto the stack.
             * 
             */
            
            
            
        }

        // Pop remaining operators from stack
        
        

        return postfix.toString().trim();
    }

    // Helper method to determine precedence of operators
    private static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;  // 1 means lower precedence 
            case '*': case '/': return 2; // 2 means higher precedence
            default: return -1;    // -1 if the operator is invalid or not recognized
        }
    }

    public static void main(String[] args) {
        String infix = "3 + 5 * 2 - 8 / 4";
        System.out.println("Postfix: " + toPostfix(infix));  
        // Expected Output: "3 5 2 * + 8 4 / -"
    }
}
