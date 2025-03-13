String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charMap.containsKey(c)) {
                if (!charMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordMap.containsKey(word)) {
                    return false;
                }
                charMap.put(c, word);
                wordMap.put(word, c);
            }
        }
        return true;