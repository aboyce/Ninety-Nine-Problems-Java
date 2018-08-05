package uk.aboyce.lists;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

// Find the last but one element of a list.
public class P02 {


    public static <T> T secondLast (List<T> list) {
        int numberOfElements = list.size();
        // Throw if the collection is empty or only contains a single element.
        if ((list == Collections.EMPTY_LIST) || (numberOfElements == 1)) {
            throw new NoSuchElementException();
        }
        return list.get(numberOfElements - 2);
    }
}
