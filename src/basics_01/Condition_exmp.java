package src.basics_01;

import java.util.Scanner;

public class Condition_exmp {

    public static void main(String[] args) {

        int a=28;

        if (a>30){
            System.out.println("given no is greater no");
        } else {
            System.out.println("given no is smaller");

            System.out.println("------------------");

            if (a%2==0)
            {
                System.out.println("a is even no");
            } else
            {
                System.out.println("a is odd no");
            }

        }
        System.out.println("------------------");

        int b=23;
        if(a==b) {
            System.out.println("both nos are same");
        }
            else{
            System.out.println("both given nos are different");

        }
        System.out.println("-----------------------");

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int p= sc.nextInt();
        int q=sc.nextInt();

        if(p>=q)
        {
            System.out.println("p is greater:" +p);
        }
        else {
            System.out.println("p is smaller" +p);
        }


    }
}
