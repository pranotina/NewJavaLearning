package src.basics_01;

public class Incre_Operator {

    public static void main(String[] args) {

        int a=12;
        System.out.println(++a+a+++a++);
        System.out.println(a);
    }
}


//a=12; ++a (e:13 a=13) o: 13
// a=13; a++ (e:13 a= 14) o: 13
//a+ 13; a++ (e: 13 a=14 ) o: 13
//a 14