package uk.aboyce.lists;

import java.util.List;


// Find the number of elements of a list.
public class P04 {

    public static <T> int length (List<T> list) {
        return list.size();
    }
}