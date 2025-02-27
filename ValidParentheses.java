class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket for the closing bracket
                }
                
                char openingBracket = stack.pop();
                
                // Check if the opening and closing brackets match
                if ((c == ')' && openingBracket != '(') ||
                    (c == ']' && openingBracket != '[') ||
                    (c == '}' && openingBracket != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}