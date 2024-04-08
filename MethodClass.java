public class MethodClass {
    public static int arraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(arr.length == 4 && arr[0].length == 4 ){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    }
                    catch(NumberFormatException e){
                        throw new MyArrayDataException(String.format("Некорректное значение в ячейке [%d][%d]", i, j));
                    }
                }
            }
        } else throw new MyArraySizeException(String.format("Был передан массив размером [%d][%d]", arr.length, arr[0].length));
        return sum;
    }
}
