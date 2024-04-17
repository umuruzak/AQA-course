public class Factorial{
    public static int getFactorial(int number) throws IllegalArgumentException{
        if(number < 0) throw new IllegalArgumentException();
        else if(number == 0 || number == 1) return 1;
        else {
            int result = 1;
            for(int i = 2; i <= number; i++){
                result *= i;
            }
            return result;
        }
    }
}
