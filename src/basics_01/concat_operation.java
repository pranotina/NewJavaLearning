package src.basics_01;

import org.w3c.dom.ls.LSOutput;

public class concat_operation {

    public static void main(String[] args) {

        int a= 10;
        int b=29;

        //compound operators: +=, -+, *=, /=, %=

       // b-=10;    //--> b=b-10
       // b*=13;
      // b/=12;
      // b +=19;  ---> 39  b=b+19
      // b++;     ---> 30
      // ++b;     ---> 30
       // --b;    ---> 28
       // b--;    //---> 28

        String s= "pranoti";

        System.out.println(a+b);
        System.out.println(s+s+a);
        System.out.println(s+a+b);
        System.out.println(b);

        //Relational operators

        int p=29;
        int q=67;
        boolean result= p<q;
        System.out.println(result);

    }


}
