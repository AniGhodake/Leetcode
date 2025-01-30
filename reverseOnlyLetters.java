class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length()-1;
    

        char[] ch = s.toCharArray();
        char temp;

        while(start <= end){
            if(Character.isLetter(ch[start]) && Character.isLetter(ch[end])){
                temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end --;
            }
            else if(!Character.isLetter(ch[start])){
                start++;
            }
            else{
               end--;
            }
        }
        s = new String(ch);
        return s;
    }
}