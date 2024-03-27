import java.util.Arrays;

import static methods.MethodClass.*;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.printf("checkSumInGap(%d, %d): %b\n", 1, 14, checkSumInGap(1, 14));
        checkNumSign(0);
        System.out.printf("isNegative(%d): %b\n", -9, isNegative(-9));
        repeat("Строка на повторение", 3);
        System.out.printf("isLeapYear(%d): %b\n", 2024, isLeapYear(2024));
        reverseBinArr();
        initializeHundred();
        multiplyByTwo();
        fillDiagonal();
        System.out.printf("initializeArr(%d, %d): %s", 7, 3, Arrays.toString(initializeArr(7, 3)));
    }
}