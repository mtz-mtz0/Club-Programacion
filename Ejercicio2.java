/*-------------------------------------------
---Elaborado por: Martinez Santos Bernardo---
---------------------------------------------*/
import javax.swing.JOptionPane;

public class Ejercicio2 {
    //Variables para alojar el numero dado y resultado 
    private int numero, resultado;

    //metodo para realizar la suma 
    public void suma() {
        //pedir el numero mediante una ventana emergente 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));


            //ciclo para separar los digitos
            while (numero > 0) {
                resultado += numero % 10;
                numero /= 10;
            }
            //impresion de resultado por ventana emergente
            JOptionPane.showMessageDialog(null,"La  suma de los digitos es: "+resultado);
               
    }

    //metodo principal para ejecutar el programa
    public static void main(String[] args){

        //creacion de objeto para imprimir el resultado
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.suma();

    }
}
