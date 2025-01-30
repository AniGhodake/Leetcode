class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder sb = new StringBuilder();
        // String ans;

        // int i = 0;

        // while(true){
        //     char curr = 0;
        //     for(String str : strs){
        //         if(i >= str.length()){           MY CODE 
        //             curr = 0;
        //             break;
        //         }
        //         if(curr == 0){
        //             curr = str.charAt(i);
        //         }
        //         else if(str.charAt(i) != curr){
        //             curr = 0;
        //             break;
        //         }

        //     }
        //     if(curr == 0){
        //         break;
        //     }   
        //     sb.append(curr);
        //     i++;
        // }

        // ans = sb.toString();
        // return ans;

         Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        
        return first.substring(0, i);
        
     }
}