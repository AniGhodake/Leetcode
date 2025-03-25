class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();

        while(col > 0){
            col--;
            char letter = (char)('A' + (col % 26));
            sb.insert(0,letter);
            col = col/26;
        }

        return sb.toString();
    }
}