package chapter12;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 17:39
 */

public class ExceptionDemo {
    /**
     * calculate the the quotient of 2 numbers
     * @Param:
     * @Return:
     */
    public static int division(int num1, int num2){
        System.out.println("Before Divide Calculation!");
        int result = Integer.MIN_VALUE;
        /**
         * Using try catch to make sure that the program will still working
         * even if an Exception happened
         * @Param: [num1, num2]
         * @Return: int
         */
        try {//Trying this syntax, catch Exception if found any
            result = num1 / num2;
        } catch (Exception e) {//catch Exception and deal with the Exception
            System.err.println("Exception:" + e.getMessage());
        }
        System.out.println("After Divide Calculation!");
        return result;
    }
    public static void main(String[] args) {
         int result = division(5, 0);
        System.out.println("Result = " + result);
    }
}
