/*-------------------------------------------
---Elaborado por: Martinez Santos Bernardo---
---------------------------------------------*/
import javax.swing.JOptionPane;

public class Ejercicio3 {
    //declaracion de variables a utilizar
    String numeros, num1 = "", num2 = " ";
    int numero1, numero2;

    public void Diferencia() {
        //Ingreso de datos del usuario
        numeros = JOptionPane.showInputDialog("Ingresa dos numeros separados por un espacio");

        //Ciclo para separar los dos numeros
        for (int i = 0; i < numeros.length(); i++) {
            if (numeros.charAt(i) == ' ') {
                num2 = num1;
                num1 = "";
            } else {
                num1 += numeros.charAt(i);
            }
        }

        //Conversion de String a Int 
        numero2 = Integer.parseInt(num2);
        numero1 = Integer.parseInt(num1);

        //operacion para encontrar la diferencia
        int resultado = numero2 - numero1;

        //impresion de mensaje con ventana emergente indicando el resultado
        JOptionPane.showMessageDialog(null, "La diferencia es: " + resultado);

    }
    //metodo principal para la ejecucion
    public static void main(String args[]) {
        Ejercicio3 diferencia = new Ejercicio3();
        diferencia.Diferencia();
    }
}
