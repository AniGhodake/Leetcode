class Solution {
    public String getHappyString(int n, int k) {
        int totalHappyStrings = 3 * (int) Math.pow(2, n - 1);
        if (k > totalHappyStrings) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int blockSize = (int) Math.pow(2, n - 1);

        if (k <= blockSize) {
            result.append('a');
        } else if (k <= 2 * blockSize) {
            result.append('b');
            k -= blockSize;
        } else {
            result.append('c');
            k -= 2 * blockSize;
        }

        for (int i = 1; i < n; i++) {
            blockSize /= 2;
            char lastChar = result.charAt(result.length() - 1);

            if (lastChar == 'a') {
                if (k <= blockSize) {
                    result.append('b');
                } else {
                    result.append('c');
                    k -= blockSize;
                }
            } else if (lastChar == 'b') {
                if (k <= blockSize) {
                    result.append('a');
                } else {
                    result.append('c');
                    k -= blockSize;
                }
            } else {
                if (k <= blockSize) {
                    result.append('a');
                } else {
                    result.append('b');
                    k -= blockSize;
                }
            }
        }

        return result.toString();
    }
}