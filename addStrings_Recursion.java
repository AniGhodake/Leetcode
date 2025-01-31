class Solution {
    public String addStrings(String num1, String num2) {
        return addHelper(num1, num2, num1.length() -1, num2.length()-1 , 0);
    }

    String addHelper(String num1, String num2, int i , int j, int carry){
        if(i < 0 && j < 0){
            return carry == 0 ? "" : String.valueOf(carry);
        }

        int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

        int sum = digit1 + digit2 + carry;

        int newCarry = sum/10;
        int lastDigit = sum%10;

        return addHelper(num1, num2, i-1,j-1, newCarry) + lastDigit;
    }
}