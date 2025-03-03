class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // Create three lists to hold elements less than, equal to, and greater than the pivot
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        // Iterate through the array and distribute elements into the respective lists
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        // Combine all three lists into the result array
        int[] result = new int[nums.length];
        int index = 0;

        // Add elements from the 'less' list
        for (int num : less) {
            result[index++] = num;
        }

        // Add elements from the 'equal' list
        for (int num : equal) {
            result[index++] = num;
        }

        // Add elements from the 'greater' list
        for (int num : greater) {
            result[index++] = num;
        }

        return result;
    }
}