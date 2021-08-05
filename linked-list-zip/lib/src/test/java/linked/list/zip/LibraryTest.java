/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testZip1(){
        LinkedList list1 = new LinkedList();
        list1.insert(9);
        list1.insert(7);
        list1.insert(5);
        list1.insert(3);
        list1.insert(1);
        LinkedList list2 = new LinkedList();
//        list2.insert(10);
        list2.insert(8);
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);
        assertEquals("[ 1 ] -> [ 2 ] -> [ 3 ] -> [ 4 ] -> [ 5 ] -> [ 6 ] -> [ 7 ] -> [ 8 ] -> [ 9 ] -> Null" , LinkedList.linkedListZip(list1,list2).toString());
    }
    @Test public void testZip2(){
        LinkedList list1 = new LinkedList();
        list1.insert(9);
        list1.insert(7);
        list1.insert(5);
        list1.insert(3);
        list1.insert(1);
        LinkedList list2 = new LinkedList();
        list2.insert(10);
        list2.insert(8);
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);
        assertEquals("[ 1 ] -> [ 2 ] -> [ 3 ] -> [ 4 ] -> [ 5 ] -> [ 6 ] -> [ 7 ] -> [ 8 ] -> [ 9 ] -> [ 10 ] -> Null" , LinkedList.linkedListZip(list1,list2).toString());
    }
    @Test public void testZip3() {
        LinkedList list1 = new LinkedList();
        list1.insert(2);
        list1.insert(3);
        list1.insert(1);
        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(9);
        list2.insert(5);
        assertEquals("[ 1 ] -> [ 5 ] -> [ 3 ] -> [ 9 ] -> [ 2 ] -> [ 4 ] -> Null" , LinkedList.linkedListZip(list1,list2).toString());
    }

}