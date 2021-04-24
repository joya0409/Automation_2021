package Day2_030721;

public class ActionItem {
    public static void main(String[] args) {
        String[] zipcode;
        int[] streetNumber;


        zipcode = new String[4];
        zipcode[0] = "11232";
        zipcode[1] = "11208";
        zipcode[2] = "10460";
        zipcode[3] = "11225";

        streetNumber = new int[4];
        streetNumber[0] = 01;
        streetNumber[1] = 02;
        streetNumber[2] = 03;
        streetNumber[3] = 04;
        int i=0;
while(i<zipcode.length){
    System.out.println("My zipcode is " + zipcode[i]+ " and My street number is "+streetNumber[i]);
    i++;


}
       // for (int i=0;i<4;i++){
            //System.out.println("My zipcode is " + zipcode[i]+ " and My street number is "+streetNumber[i]);


      //  }

    }
}
