public class BitManipulation {

    public static void main(String[] args) {
        //Get Bit
//        int n = 5;//0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//
//        if((bitMask & n)==0){
//            System.out.println("Bit is 0");
//        }
//        else{
//            System.out.println("Bit is 1");
//        }

        //Set Bit

        int n = 5;//0101
        int pos = 1;
        int bitMask = 1<<pos;

        int check= bitMask | n;
        System.out.println(check);
    }
}