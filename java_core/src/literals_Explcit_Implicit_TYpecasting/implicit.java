package literals_Explcit_Implicit_TYpecasting;

public class implicit {
    public static void main(String[] args) {

        // IMPLICIT / WIDENING TYPECASTING :

        /*
            SMALLER TO BIGGER DATATYPE : WIDENING
            Because on the left side we are adding more 0's

            INT -> 32 BITS >>> ASSIGNING TO >>> LONG -> 64 BITS
            Adds 32 more 0's
        */

        // EXAMPLES :

        byte a = 126;
        short b = a;
        System.out.println("b:" + b);

        int c = 222222;
        long d = c;
        System.out.println("c:" + c);

        // out of range value (still valid due to widening)

        short f = 127;
        int e = f;
        System.out.println("e:" + e);

        // byte g = 8900;

        /*
            ERROR: incompatible types: possible lossy conversion from int to byte

            REASON:
            8900 is an INTEGER literal (32 bits by default)

            INT (32 bits) >>> BYTE (8 bits)

            Compiler checks range (-128 to 127)
            Out of range → compile-time error
        */
    }
}
