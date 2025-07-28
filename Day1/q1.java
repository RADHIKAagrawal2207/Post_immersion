public class q1 {
    public class HomophoneTasks {
    public static void main(String[] args) {
        String[][] homophones = {
            {"pair", "pear"},
            {"flour", "flower"},
            {"sea", "see"},
            {"knight", "night"},
            {"to", "too"},
            {"owl", "awe"}
        };

        System.out.println("1️Word with greater length in each pair:");
        printLongerWord(homophones);

        System.out.println("Pairs where both words have the same length:");
        printEqualLengthPairs(homophones);

        System.out.println("Words starting with a consonant:");
        printWordsStartingWithConsonant(homophones);

        System.out.println("Pairs where at least one word starts with a vowel:");
        printPairsWithVowelStart(homophones);
    }

    // 1. Print the word whose length is greater than the other in the pair
    static void printLongerWord(String[][] pairs) {
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];

            if (word1.length() > word2.length()) {
                System.out.println(word1);
            } else if (word2.length() > word1.length()) {
                System.out.println(word2);
            } else {
                System.out.println("Both same length: " + word1 + ", " + word2);
            }
        }
    }

    // 2. Find and print all pairs where both words have the same number of characters
    static void printEqualLengthPairs(String[][] pairs) {
        for (String[] pair : pairs) {
            if (pair[0].length() == pair[1].length()) {
                System.out.println(pair[0] + " - " + pair[1]);
            }
        }
    }

    // 3. Print all words from the homophone pairs that start with a consonant
    static void printWordsStartingWithConsonant(String[][] pairs) {
        for (String[] pair : pairs) {
            for (String word : pair) {
                char first = Character.toLowerCase(word.charAt(0));
                if (!isVowel(first)) {
                    System.out.println(word);
                }
            }
        }
    }

    // 4. Print all pairs where at least one word starts with a vowel
    static void printPairsWithVowelStart(String[][] pairs) {
        for (String[] pair : pairs) {
            char first1 = Character.toLowerCase(pair[0].charAt(0));
            char first2 = Character.toLowerCase(pair[1].charAt(0));

            if (isVowel(first1) || isVowel(first2)) {
                System.out.println(pair[0] + " - " + pair[1]);
            }
        }
    }

    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
}