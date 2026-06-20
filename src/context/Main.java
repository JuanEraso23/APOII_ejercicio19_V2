package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int num = 0;

        //Menú
        while (num != 11) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "TABLAS DE MULTIPLICAR\n\n"
                            + "Digite un número\n"
                            + "(1 al 10)\n"
                            + "(11 para salir)"
                    )
            );

            switch (num) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

                String resultado = "";
                
                //Ciclo
                for (int i = 0; i <= 10; i++) {
                    int multiplo = num * i;
                    resultado +=
                            num + " x "
                            + i + " = "
                            + multiplo + "\n";
                }
                
                //Resultado
                JOptionPane.showMessageDialog(
                        null,
                        "Tabla del " + num + "\n\n" + resultado
                );
                break;

            case 11:
                JOptionPane.showMessageDialog(
                        null,
                        "Salir"
                );
                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "¡ERROR!\nIngrese un número entre 1 y 11"
                );
                break;
            }
        }
    }
}