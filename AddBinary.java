class Solution {
    public String addBinary(String a, String b) {
        //    // Convert binary strings to integers
        // int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        
        // // Convert the sum back to binary string
        // return Integer.toBinaryString(sum);


        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            sb.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry != 0) sb.append(carry);
        
        return sb.reverse().toString();
    }
}