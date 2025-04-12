class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        List<int[]> scoreIndexPairs = new ArrayList<>();
        
        // Create pairs of score and original index
        for (int i = 0; i < n; i++) {
            scoreIndexPairs.add(new int[]{score[i], i});
        }
        
        // Sort the pairs in descending order based on scores
        Collections.sort(scoreIndexPairs, (a, b) -> Integer.compare(b[0], a[0]));
        
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            int originalIndex = scoreIndexPairs.get(i)[1];
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }
}