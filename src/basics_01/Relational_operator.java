package src.basics_01;

public class Relational_operator {

    public static void main(String[] args) {

        //Relational operators

        //in int -->value, string --> reference

        int p=29;
        int q=67;
        boolean result= p<q;    //t
        boolean r1 = p<=q;     //t
        boolean r2 = p>=q;     //f
        boolean r3 = p>q;      //f
        boolean r4 = p==q;    //f
        boolean r5 = p!=q;    //t

        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r1);

        String s1= "Pranoti";
        String s2 = "Amd";

        boolean r = (s1==s2);  //f

        System.out.println("-------------");
        System.out.println(r);
        System.out.println("-------------");

        System.out.println('A'==65);   //ascii  //in sout comparison is allowed

      //  System.out.println('A'=65);   //in sout assignment is not allowed


        byte b=65;

        System.out.println("------------");
        System.out.println('A'==b);    //t

        System.out.println("------------");

        System.out.println('A'==65.00);   //t

        System.out.println("------------");
        System.out.println(true==true);   //t






    }
}
