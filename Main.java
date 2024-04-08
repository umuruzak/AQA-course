import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = new String[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                correctArray[i][j] = i + j + "";
            }
        }
        String[][] incorrectSize = new String[4][3];
        String[][] incorrectData = new String[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                incorrectData[i][j] = i + j + "";
            }
        }
        incorrectData[2][3] = "not a number";

        try {
            System.out.println(MethodClass.arraySum(incorrectSize));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(MethodClass.arraySum(incorrectData));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Корректный массив:");
        for(String[] arr : correctArray){
            System.out.println(Arrays.toString(arr));
        }
        try {
            System.out.println("Сумма: " + MethodClass.arraySum(correctArray));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}