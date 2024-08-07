public class PrimitiveFloat {
    public static void main(String[] args) {
        float f = 3.4028235E38F; // 32 bits 1.4E-45 to 3.4028235E38
        System.out.println("f = " + f);
        System.out.println("Float.BYTES = " + Float.BYTES);
        System.out.println("Float.SIZE = " + Float.SIZE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("\n");

        double d = 1.7976931348623157E308; // 64 bits 4.9E-324 to 1.7976931348623157E308
        System.out.println("d = " + d);
        System.out.println("Double.BYTES = " + Double.BYTES);
        System.out.println("Double.SIZE = " + Double.SIZE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("\n");
    }
}
