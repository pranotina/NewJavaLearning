package src.basics_01;

public class Demo_string {
    public static void main(String[] args) {


        String st1="Pranoti";     //string constant pool
        String st2= new String ("pranoti");    //obj area/ heap area

        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st2==new String("pranoti"));


        String s1 = "new";
        String s2 = "new1";




    }
}
