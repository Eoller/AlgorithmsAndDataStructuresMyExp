package algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by unity on 12.07.18.
 */
public class SearchAlgorytmsTest {

    @Test
    public void testBinarySearchRecursive() throws Exception {
        //given
        int toTest[] = {2,3,7,16,24,66};
        int toTest2[] = {-55, -12, 0, 30, 666, 810, 888, 1111, 9654};
        //when
        int index = SearchAlgorytms.binarySearchRecursive(toTest, 16, 0, toTest.length - 1);
        int index2 = SearchAlgorytms.binarySearchRecursive(toTest2, -55, 0, toTest2.length - 1);

        //then
        assertEquals(3, index);
        assertEquals(0, index2);
    }

    @Test
    public void testBinarySearch() throws Exception {
        //given
        int toTest[] = {2,3,7,16,24,66};
        int toTest2[] = {-55, -12, 0, 30, 666, 810, 888, 1111, 9654};
        //when
        int index = SearchAlgorytms.binarySearch(toTest, 16, 0, toTest.length - 1);
        int index2 = SearchAlgorytms.binarySearch(toTest2, -55, 0, toTest2.length - 1);

        //then
        assertEquals(3, index);
        assertEquals(0, index2);
    }

    @Test
    public void testGit(){
        System.out.println("xxx");
    }
}