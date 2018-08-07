package uk.aboyce.lists;

import java.util.ArrayList;
import java.util.List;

// Flatten a nested list structure.
public class P07 {


    public static <T> List<T> flatten (List<?> list, Class<T> typeOfElement) {

        List<T> flatList = new ArrayList<T>();

        list.forEach(e -> {
            if (e instanceof List) {
                flatList.addAll(flatten((List<?>) e, typeOfElement));
            } else {
                flatList.add((T)e);
            }
        });

        return flatList;
    }
}
