class Solution {
    public int maximumCandies(int[] candies, long k) {
         int maxCandies = 0;
        long totalCandies = 0;
        for (int c : candies) {
            maxCandies = Math.max(maxCandies, c);
            totalCandies += c;
        }

        // If total candies are less than the number of children, return 0 immediately
        if (totalCandies < k) return 0;

        // Step 2: Perform binary search to find the maximum candies per child
        int left = 1, right = maxCandies, answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Mid value to test
            
            if (canDistribute(candies, k, mid)) {
                answer = mid; // Update answer
                left = mid + 1; // Try a larger mid
            } else {
                right = mid - 1; // Try a smaller mid
            }
        }
        return answer;
    }

    // Step 3: Helper function to check if we can distribute `mid` candies per child
    private boolean canDistribute(int[] candies, long k, int mid) {
        long count = 0; // Count how many children can receive candies
        for (int c : candies) {
            count += c / mid; // Number of children that can be served from this pile
            if (count >= k) return true; // Early exit if enough children are served
        }
        return count >= k;
    }
}