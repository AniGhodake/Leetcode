class Solution {

    boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {
        int l = 0;
        int h = s.length() - 1;
        
        // Convert string to character array for mutability
        char[] charArray = s.toCharArray();

        while (l < h) {
            if (isVowel(charArray[l]) && isVowel(charArray[h])) {
                // Swap vowels
                char temp = charArray[l];
                charArray[l] = charArray[h];
                charArray[h] = temp;

                l++;
                h--;
            } else if (!isVowel(charArray[l])) {
                l++;
            } else {
                h--;
            }
        }

        // Update the original string s by creating a new string from the char array
        s = new String(charArray);  // This updates s with the swapped vowels

        // Return the updated s
        return s;
    }
}