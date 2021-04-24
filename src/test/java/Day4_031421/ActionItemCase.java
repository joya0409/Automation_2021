package Day4_031421;

public class ActionItemCase {
    public static void main(String[] args) {
        String grade= "E";
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Well done");
                break;
            case "C":
                System.out.println("Satisfactory");
                break;
            case "D":
                System.out.println("Passed");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade " + grade);


        }


    }//end of main

}//end of java
