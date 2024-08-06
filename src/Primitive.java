public class Primitive {
    public static void main(String[] args) {

        byte b = 127; // 8 bits -128 to 127
        System.out.println("b = " + b);
        System.out.println("Byte.BYTES = " + Byte.BYTES);
        System.out.println("Byte.SIZE = " + Byte.SIZE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("\n");

        short s = 32767; // 16 bits -32,768 to 32,767
        System.out.println("s = " + s);
        System.out.println("Short.BYTES = " + Short.BYTES);
        System.out.println("Short.SIZE = " + Short.SIZE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("\n");

        int number = 5; // 32 bits -2,147,483,648 to 2,147,483,647
        System.out.println("number = " + number);
        System.out.println("Integer.BYTES = " + Integer.BYTES);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("\n");

        long l = 9223372036854775807L; // 64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("l = " + l);
        System.out.println("Long.BYTES = " + Long.BYTES);
        System.out.println("Long.SIZE = " + Long.SIZE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("\n");

        var v = 5; // 32 bits -2,147,483,648 to 2,147,483,647
        System.out.println("v = " + v);
        System.out.println("Integer.BYTES = " + Integer.BYTES);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("\n");
    }
}
