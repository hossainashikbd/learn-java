package TwelvthClass;

public class Integer {
    public static void main(String[] args) {
        String s = new String("This is a string");
        String s1 = "This is also a string";

        String s2 = "Welcome to Java";
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        s2 = "Changed Test";

        System.out.println("s2 == s3 is " + (s2 == (s3)));
        System.out.println("s2 == s4 is " + (s2 ==(s4)));


        System.out.println("s2 == s3 is " + (s2.equals(s3)));
        System.out.println("s2 == s4 is " + (s2.equals(s4)));

        int a = 1;
        int b = 2;
        System.out.println(a == b);
    }
}
