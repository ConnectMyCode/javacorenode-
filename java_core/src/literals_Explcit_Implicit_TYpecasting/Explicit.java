package literals_Explcit_Implicit_TYpecasting;

public class Explicit {

	    public static void main(String[] args) {

	        // EXPLICIT TYPECASTING :

	        /*
	            ASSIGN A BIGGER >>> SMALLER DATATYPE >>> EXPLICIT TYPECASTING.
	            IN EXPLICIT THERE IS "CHANCE" >>> OF >>> DATA LOSS.
	        */

	        // BYTE CASE : HOW MANY DIGITS IN -128 TO 127 = 256 DIGITS.

	        System.out.println("IF, VALUE > 127 : SUBTRACT -256 UNTIL WITHIN THE RANGE -128 TO 127\n");
	        System.out.println("IF, VALUE < -127 : ADD 256 UNTIL WITHIN THE RANGE -128 TO 127\n");

	        /*
	        short a = 32765;
	        byte b = a;
	        ERROR: incompatible types: possible lossy conversion from short to byte
	        */

	        /*
	            WHY?
	            SHORT (16 bits) >>> BYTE (8 bits)
	            Value may overflow and data is lost.
	        */

	        /*
	            WHAT TO DO?
	            Explicitly tell the compiler to convert SHORT >>> BYTE
	        */

	        short a_1 = 32765;
	        byte b_1 = (byte) a_1;
	        System.out.println("b_1 = " + b_1);

	        short x = 128;
	        byte y = (byte) x;

	        long m = 789456132L;
	        int n = (short) m;

	        int x1 = 88900;
	        short y1 = (short) x1;

	        byte z1 = (byte) 88899900L;

	        int l = (int) 8888888888888L;

	        String day = "TUESDAY";
	        String out = switch (day) {
	            case "MONDAY", "TUESDAY", "WEDNESDAY" -> "Weekday";
	            default -> "Other";
	        };
	        System.out.println(out);

	        int num = 2;
	        String result = switch (num) {
	            case 1 -> "one";
	            case 2 -> "two";
	            default -> "other";
	        };
	        System.out.println(result);

	        double s1 = 0;
	        int s2 = 0;

	        System.out.println(s2 / s1);   // Infinity
	    }
	}


