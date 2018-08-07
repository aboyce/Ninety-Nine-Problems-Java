package uk.aboyce.lists;

import java.util.ArrayList;
import java.util.List;

// Eliminate consecutive duplicates of list elements.
public class P08 {


    public static <T> List<T> compress(List<T> list) {

        List<T> trimmedList = new ArrayList<>();

        list.forEach(item -> {
            if (trimmedList.size() == 0) {
                trimmedList.add(item);
            } else if (item.equals(trimmedList.get(trimmedList.size() - 1))) {
                return;
            } else {
                trimmedList.add(item);
            }
        });

        return trimmedList;
    }
}
