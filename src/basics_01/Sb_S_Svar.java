package src.basics_01;

public class Sb_S_Svar {



        public static void main(String[] args) {

            StringBuffer s= new StringBuffer("Pranoti");
            s.append("@Suraj");
            System.out.println(s);//Pranoti@Suraj


            StringBuffer s1= new StringBuffer("Pranoti");
            StringBuffer s2= new StringBuffer("Pranoti");
            System.out.println(s1.equals(s2));// false
            System.out.println(s1==s2);// false

            // This is varable
            String a1="Hello";
            String a2="Hello";
            System.out.println(a1==a2);// True
            System.out.println(a1.equals(a2));// True


            String b1=new String("Hello");
            String b2=new String("Hello");
            System.out.println(b1==b2);// false - comparing ref
            System.out.println(b1.equals(b2));// True : comparing val




            // String s=new String("Pranoti");
            // s.concat("New pranoti"); //should not update existing value
            // System.out.println(s.concat("New pranoti"));//PranotiNew pranoti

            // String s1=s.concat("@suraj"); //concat and assign to new variable
            // System.out.println("s: "+s);
            // System.out.println("s1: "+s1);

            // String x="Mona";
            // x.concat("Darling");
            // System.out.println(x);

            // String x1=x.concat("Darling");
            // System.out.println(x1);

            // int a=10;
            // System.out.println(a); //10
            // a+=20;//update existing value
            // System.out.println(a);//30

            // String name="water";
            // String name1="water";
            // System.out.println(name==name1); //true
            // System.out.println(name.equals(name1));//true
        }
}