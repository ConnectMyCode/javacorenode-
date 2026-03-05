package literals_Explcit_Implicit_TYpecasting;

import java.util.*;

public class literals {

    public static void main(String[] args) {

        /*
        final byte b1 = 10;
        byte b2 = b1 + 10;     // ERROR: int result
        b1 = b1 + 10;          // ERROR: final + int result
        System.out.println("b1:" + b1);
        byte result = b2;
        System.out.println(result);
        */

        /*
        String s1 = 10 + 20;   // 😄 compile-time error
        String s2 = "";
        String result = s1 + s2;
        System.out.println(result);
        */

        /*
        int[] a = {1, 2, 3};
        for (int x : a) { x = x * 2; }
        for (int y : a) { System.out.print(y + " "); }
        */

        /*
        for (int i = 0; i < 5; i++, i++) {
            System.out.print(i + " ");
        }
        */

        String day = "TUESDAY";
        String out = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY" -> "Weekday";
            default -> "Other";
        };
        System.out.print(out);

        /*
        IO.println("Octal to decimal base = 8");
        int num = 015;
        int temp = num;
        int sum = 0;

        int ld_1 = temp % 10;
        sum += 1 * ld_1;

        temp = temp / 10;
        int ld_2 = temp % 10;
        sum += 8 * ld_2;

        System.out.println("octal to Decimal: " + sum);
        */

        // IMP:
        // Compiler automatically converts octal to decimal

        short octal = 026;   // octal representation
        System.out.println("octal to decimal: " + octal);

        /*
        byte hexadecimal = 0X3276;
        System.out.println("hexadecimal to decimal: " + hexadecimal);
        ERROR: lossy conversion (0x3276 = 12918 > 127)
        */

        int binary = 0B01111;   // binary literal
        System.out.println("Binary to decimal: " + binary);

        // Lossy conversion cases

        byte b = 12;
        // System.out.println("Case 3:" + mob);  // ❌ mob not declared

        /*
        long mob_1 = 12345678910;
        System.out.println("Case 3:" + mob_1);
        ERROR: integer number too large
        */

        long mob_2 = 12345678910L;
        System.out.println("Case 3:" + mob_2);
    }
}
