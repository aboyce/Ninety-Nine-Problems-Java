package uk.aboyce.lists;

import java.util.Collections;
import java.util.List;

// Reverse a list.
public class P05 {

    public static <T> List<T> reverse (List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("The list cannot be null.");
        }
        // Reverse the list, this does not return anything.
        Collections.reverse(list);
        return list;
    }
}
