/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library test = new Library();
        int[] arr = {8,6,4,7,5,1};
        assertEquals("[1, 4, 5, 6, 7, 8]",Arrays.toString(test.InsertionSort(arr)));
    }
}
