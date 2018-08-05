package uk.aboyce.lists;

import java.util.List;


//Find the last element of a list.
public class P01 {

    public static <T> T last (List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }
}