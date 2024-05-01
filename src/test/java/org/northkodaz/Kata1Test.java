package org.northkodaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata1Test {

    @org.junit.jupiter.api.Test
    void sumOfAllNumbersInArray() {
        // arrange
        Kata1 kata1 = new Kata1();
        int[] numbers = {10, 1, 2, 3, 6};
        int expected = 11;

        // act
        int actual = kata1.sumOfAllNumbersInArray(numbers);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void sumArrayOfOneReturnsZero() {
        // arrange
        Kata1 kata1 = new Kata1();
        // assert

        assertEquals(21, kata1.sumOfAllNumbersInArray(new int[]{5, 2, 6, 10, 22}));
        assertEquals(9, kata1.sumOfAllNumbersInArray(new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, kata1.sumOfAllNumbersInArray(new int[]{1,2,3}));
        assertEquals(0, kata1.sumOfAllNumbersInArray(new int[]{}));
        assertEquals(0, kata1.sumOfAllNumbersInArray(new int[]{10}));
        assertEquals(0, kata1.sumOfAllNumbersInArray(new int[]{10,5}));
    }


}