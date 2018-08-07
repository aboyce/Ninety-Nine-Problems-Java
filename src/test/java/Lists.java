import org.junit.Test;
import uk.aboyce.lists.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Lists {

    // P01
    @Test
    public void p01_shouldFindLastElementFromAListOfAlphabets() throws Exception {
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    // P02
    @Test
    public void p02_shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02.secondLast(numbers), is(equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void p02_shouldThrowExceptionWhenListEmpty() throws Exception {
        P02.secondLast(Collections.emptyList());
    }

    @Test(expected = NoSuchElementException.class)
    public void p02_shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        P02.secondLast(Arrays.asList(1));
    }

    // P03
    @Test
    public void p03_shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(P03.kth(numbers, 2), is(equalTo(3)));
    }

    // P04
    @Test
    public void p04_listOfEmptyListShouldBe0() throws Exception {
        int length = P04.length(Collections.emptyList());
        assertThat(length, is(equalTo(0)));
    }

    @Test
    public void p04_shouldFindListOfNonEmptyList() throws Exception {
        assertThat(P04.length(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    // P05
    @Test
    public void p05_shouldReverseAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(P05.reverse(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    // P06
    @Test
    public void p06_shouldReturnTrueWhenListIsPalindrome() throws Exception {
        assertTrue(P06.isPalindrome(Arrays.asList("x", "a", "m", "a", "x")));
    }

    @Test
    public void p06_shouldReturnFalseWhenListIsNotPalindrome() throws Exception {
        assertFalse(P06.isPalindrome(Arrays.asList(1, 2, 3, 4, 5)));
    }

    // P07
    @Test
    public void p07_shouldFlattenAListOfList() throws Exception {
        List<String> flatten = P07.flatten(asList("a", asList("b", asList("c", "d")), "e"), String.class);
        //assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }

    @Test
    public void p07_shouldFlattenDeepNestedLists() throws Exception {
        List<String> flatten = P07.flatten(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")), String.class);
        //assertThat(flatten, hasSize(8));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e", "f", "g", "h"));
    }

    @Test
    public void p07_shouldReturnEmptyListWhenTryingToFlattenAnEmptyList() throws Exception {
        List<String> flatten = P07.flatten(Collections.emptyList(), String.class);
        assertTrue(flatten.isEmpty());
    }

    @Test
    public void p07_shouldReturnSameListWhenListHasNoNestedList() throws Exception {
        List<String> flatten = P07.flatten(asList("a", "b", "c", "d", "e"), String.class);
        //assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }
}
