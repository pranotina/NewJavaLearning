package src.basics_01;

public class Logical_operator {

    public static void main(String[] args) {

        //Logical Operator: !, &&, ||
        boolean a=false;
        System.out.println(!a);           //t
        System.out.println(!(10>20));     //t
        System.out.println(!(20<30));     //f


        int p=10;
        int q=34;
        int r=35;
        int s=67;

        System.out.println("------------");
        System.out.println((p==q)||(r==s));   //f
        System.out.println((p<=q)||(r>=s));   //t

        System.out.println("--------");

        System.out.println((p==q)||(r==s));   //f
        System.out.println((p<=q)&&(r>=s));   //f
        System.out.println((p<=q)&&(r<=s));   //t



    }
}
