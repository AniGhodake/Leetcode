class Solution {
    public int maximumSum(int[] nums) {
        int maxPairSum = -1; // Store the maximum sum of pairs with the same digit sum
        Map<Integer, Integer> digitSumMap = new HashMap<>(); // Stores max number for each digit sum

        for (int num : nums) {
            int digitSum = calculateDigitSum(num); // Get sum of digits

            // If another number with the same digit sum exists, update maxPairSum
            if (digitSumMap.containsKey(digitSum)) {
                maxPairSum = Math.max(maxPairSum, digitSumMap.get(digitSum) + num);
            }

            // Store the largest number for each digit sum
            digitSumMap.put(digitSum, Math.max(digitSumMap.getOrDefault(digitSum, 0), num));
        }

        return maxPairSum;
    }

    private int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10; // Remove last digit
        }
        return sum;

    }
}