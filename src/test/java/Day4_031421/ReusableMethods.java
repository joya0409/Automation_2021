package Day4_031421;

public class ReusableMethods {

    //create a reusable method which will add two numbers and print out the statement

    public static void addTwoNumber(int number1, int number2){
        System.out.println("My result is " + (number1+number2));

    }//end of method

    public static int subtractTwoNumbers(int number1, int number2){
        int result = number1-number2;
        System.out.println("My result is " +result);
        return result;

    }//end of method

}//end of java class
