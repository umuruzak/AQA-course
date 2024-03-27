package methods;

import java.util.Arrays;

public class MethodClass {
    //1
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    //2
    public static void checkSumSign(){
        int a = 6;
        int b = -7;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
    //3
    public static void printColor(){
        int value = 125;
        if(value <= 0){
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else{
            System.out.println("Зеленый");
        }
    }
    //4
    public static void compareNumbers(){
        int a = 7;
        int b = 3;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
    //5
    public static boolean checkSumInGap(int a, int b){
        return ((a + b) > 10 && (a + b) <= 20) ? true : false;
    }
    //6
    public static void checkNumSign(int a){
        System.out.println(a >= 0 ? "Положительное число" : "Отрицательное число");
    }
    //7
    public static boolean isNegative(int a){
        return a < 0 ? true : false;
    }
    //8
    public static void repeat(String str, int count){
        for(int i = 0; i < count; i++){
            System.out.println(str);
        }
    }
    //9
    public static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        } else if((year % 100 != 0) && (year % 4 == 0)){
            return true;
        }
        return false;
    }
    //10
    public static void reverseBinArr(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив до: " + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println("Массив после: " + Arrays.toString(arr));
    }
    //11
    public static void initializeHundred(){
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = i + 1;
        }
        System.out.println("Массив из 100 чисел: " + Arrays.toString(arr));
    }
    //12
    public static void multiplyByTwo(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до: " + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6) arr[i] *= 2;
        }
        System.out.println("Массив после: " + Arrays.toString(arr));
    }
    //13
    public static void fillDiagonal(){
        int[][] matrix = new int[5][5];
        System.out.println("Матрица до:");
        for(int[] arr : matrix) System.out.println(Arrays.toString(arr));
        for(int i = 0; i < matrix.length; i++){
            matrix[i][i] = 1;
            matrix[i][(matrix[i].length - 1) - i] = 1;
        }
        System.out.println("Матрица после:");
        for(int[] arr : matrix) System.out.println(Arrays.toString(arr));
    }
    //14
    public static int[] initializeArr(int len, int initialValue){
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

}
