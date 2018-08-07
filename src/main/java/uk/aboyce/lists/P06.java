package uk.aboyce.lists;

import java.util.List;

// Find out whether a list is a palindrome.
public class P06 {

    public static <T> boolean isPalindrome (List<T> list) {
        // Go over the list, checking that the beginning element matches the last element.
        // Repeat this throughout the length of the list.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get((list.size() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
