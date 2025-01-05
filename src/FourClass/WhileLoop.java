package FourClass;

import java.sql.SQLOutput;

public class WhileLoop {
    public static void main(String[] args) {
        //while lopp
        int result = 0;
        int i = 1;

        while (i<=100){
            System.out.println(i);
            result += i;

            i++;
        }
        System.out.println("Sum is" + result);
    }
}
