package src.basics_01;

public class casting_data {
    public static void main(String[] args) {

        byte a=10;
       //  int b= a;    //implicit casting
        int b= (int) a;    //explicit casting

        System.out.println(b);   //10

        int a1=300;
      // byte b1 = a1;   //invalid implicit casting
        byte b1 = (byte) a1;   //valid explicit casting
        System.out.println("------------");
        System.out.println(b1);    //44 converted to byte value using bits




    }
}
