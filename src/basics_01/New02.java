package src.basics_01;

public class New02 {
    public static void main(String[] args) {
String s="abc";
        System.out.println(s.hashCode());
//        System.out.println(Inte);

        s="dfg";
        System.out.println(s.hashCode());
        System.out.println(s);

        int j=20;

        System.out.println("--------------");
       // System.out.println(Integer.toHexString(hashCode));
        System.out.println(System.identityHashCode(j));
        j=30;
        System.out.println(System.identityHashCode(j));

    }
}
