class Solution {
    public int maxDifference(String s) {
        int characterFrequencies[] = new int[26];

        for(char currentChar : s.toCharArray()){
            int index = currentChar - 'a';
            characterFrequencies[index]++;
        }

        int maxOddFrequency = 0;
        int minEvenFrequency = Integer.MAX_VALUE;

        for(int frequency : characterFrequencies){
            if(frequency > 0){
                if(frequency % 2 == 1){
                    if(frequency > maxOddFrequency){
                        maxOddFrequency = frequency;
                    }
                }
                else{
                    if(frequency < minEvenFrequency){
                        minEvenFrequency = frequency;
                    }
                }
            }
        }
        return maxOddFrequency - minEvenFrequency;
    }
}