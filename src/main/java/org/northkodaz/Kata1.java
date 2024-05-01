package org.northkodaz;

import java.util.Arrays;

public class Kata1 {
    public int sumOfAllNumbersInArray(int[] numbers) {
        // create result variable
        int result = 0;
        // sort the array
        Arrays.sort(numbers);
        // 123456
        // for each number in the array
        for (int i = 1; i < numbers.length -1; i++) {
          // add to result
            result += numbers[i];
        }

        return result;
    }
}
