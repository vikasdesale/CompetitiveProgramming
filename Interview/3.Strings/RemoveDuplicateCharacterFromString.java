package com.udacity.stockhawk;

/**
 * Created by Dell on 4/1/2017.
 */

/**
 * Java Program to remove duplicate characters from String. *
 *
 * @author Vikas Desale
 */
public class RemoveDuplicateCharacters {
Read more

    public static void main(String args[]) {
        System.out.println("Call removeDuplicates(String word) method ....");
        String[] testdata = {"aabscs", "abcd", "aaaa", null, "", "aaabbb", "abababa"};
        for (String input : testdata) {
            System.out.printf("Input : %s Output: %s %n", input, removeDuplicates(input));
        }
        System.out.println("Calling removeDuplicatesFromString(String str).");
        for (String input : testdata) {
            System.out.printf("Input : %s Output: %s %n", input, removeDuplicatesFromString(input));
        }
    }

    /* * This algorithm goes through each character of String to check if its * a duplicate of already found character. It skip the duplicate * character by inserting 0, which is later used to filter those * characters and update the non-duplicate character. * Time Complexity of this solution is O(n^2), excluded to * UniqueString() method, which creates String from character array. * This method will work even if String contains more than one duplicate * character. */
    public static String removeDuplicates(String word) {
        if (word == null || word.length() < 2) {
            return word;
        }
        int pos = 1; // possible position of duplicate character 
        char[] characters = word.toCharArray();
        for (int i = 1; i < word.length(); i++) {
            int j;
            for (j = 0; j < pos; ++j) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == pos) {
                characters[pos] = characters[i];
                ++pos;
            } else {
                characters[pos] = 0;
                ++pos;
            }
        }
        return toUniqueString(characters);
    } /* * This solution assumes that given input String only contains * ASCII characters. You should ask this question to your Interviewer, * if he says ASCII then this solution is Ok. This Algorithm * uses additional memory of constant size. */

    public static String removeDuplicatesFromString(String input) {
        if ( input == null || input.length() & lt;2){
            return input;
        }
        boolean[] ASCII = new boolean[256];
        char[] characters = input.toCharArray();
        ASCII[input.charAt(0)] = true;
        int dupIndex = 1;
        for (int i = 1; i & lt; input.length() ;i++){
            if (!ASCII[input.charAt(i)]) {
                characters[dupIndex] = characters[i];
                ++dupIndex;
                ASCII[characters[i]] = true;
            } else {
                characters[dupIndex] = 0;
                ++dupIndex;
            }
        }
        return toUniqueString(characters);
    } /* * Utility method to convert Character array to String, omitting * NUL character, ASCII value 0. */
}

        public static String toUniqueString(char[] letters) {
        StringBuilder sb = new StringBuilder(letters.length);
        for (char c : letters) {
            if (c != 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
