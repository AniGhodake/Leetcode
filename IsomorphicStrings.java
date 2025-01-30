class Solution {
    public boolean isIsomorphic(String s, String t) {
        int hash[] =  new int[256];
        boolean isCharMapped[] = new boolean[256];

        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(hash[sc] == 0){
                if(isCharMapped[tc]){
                    return false;
                }
                hash[sc] = tc;
                isCharMapped[tc] = true;
            }
            else if(hash[sc] != tc){
                return false;
            }
        }
        return true;
    }
}