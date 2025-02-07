class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if( !st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb = sb.append(st.peek());
            st.pop();
        }
        
        // sb = sb.reverse();
        // String ans = sb.toString();
        return sb.reverse().toString();
    }
}