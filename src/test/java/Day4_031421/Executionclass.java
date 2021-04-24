package Day4_031421;

public class Executionclass {
    public static void main(String[] args) {
        //this is where you can call your reusable method to be executed
        //inside main method

       // ReusableMethods.addTwoNumber(20,30);
        //ReusableMethods.addTwoNumber(60,30);
//call subtract method and store the result
        int c = ReusableMethods.subtractTwoNumbers(40,20);
        System.out.println("New result " +(c+5));
        


    }//end of main method
}
