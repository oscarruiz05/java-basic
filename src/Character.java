import javax.swing.*;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        char c = 'A'; // 16 bits 0 to 65,535
        System.out.println("c = " + c);

        // binary
        int number = 65;
        System.out.println("number +  = " + number + " binary = " + Integer.toBinaryString(number));

        // octal
        System.out.println("number +  = " + number + " octal = " + Integer.toOctalString(number));

        try {
            /* ingresar datos por ventana de dialogo */
            String numberStr = JOptionPane.showInputDialog(null, "Ingrese un numero entrero");
            int numberInt = Integer.parseInt(numberStr);

            String message = "El numero " + numberInt + " en binario es " + Integer.toBinaryString(numberInt);
            JOptionPane.showMessageDialog(null, message);

            /* ingresar datos por terminal */
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero entero");
            int numberTerminal = scanner.nextInt();
            System.out.println("El numero " + numberTerminal + " en binario es " + Integer.toBinaryString(numberTerminal));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            main(args);
            System.exit(0);
        }
    }

}
