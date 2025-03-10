class Solution {
    public long countOfSubstrings(String word, int k) {
         return substringsWithAtMost(word, k) - substringsWithAtMost(word, k - 1);
    }

    private long substringsWithAtMost(String word, int k) {
        if (k == -1) return 0;
        
        long res = 0;
        int vowels = 0, uniqueVowels = 0;
        Map<Character, Integer> vowelLastSeen = new HashMap<>();
        
        for (int l = 0, r = 0; r < word.length(); ++r) {
            char ch = word.charAt(r);
            
            if (isVowel(ch)) {
                vowels++;
                if (!vowelLastSeen.containsKey(ch) || vowelLastSeen.get(ch) < l) {
                    uniqueVowels++;
                }
                vowelLastSeen.put(ch, r);
            }

            while (r - l + 1 - vowels > k) {
                char leftChar = word.charAt(l);
                if (isVowel(leftChar)) {
                    vowels--;
                    if (vowelLastSeen.get(leftChar) == l) {
                        uniqueVowels--;
                    }
                }
                l++;
            }

            if (uniqueVowels == 5) {
                int minVowelLastSeen = Integer.MAX_VALUE;
                for (char v : "aeiou".toCharArray()) {
                    minVowelLastSeen = Math.min(minVowelLastSeen, vowelLastSeen.getOrDefault(v, Integer.MAX_VALUE));
                }
                res += minVowelLastSeen - l + 1;
            }
        }
        return res;
    }

    boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    
    }
}