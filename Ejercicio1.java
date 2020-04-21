/*-------------------------------------------
---Elaborado por: Martinez Santos Bernardo---
---------------------------------------------*/
import javax.swing.JOptionPane;

public class Ejercicio1 {

    //Variable para alojar el parametro
    private int parametro;

    //metodo que retorna la serie 
    public void CrearSerie() {
        //Pedir el parametro al usuario por una ventana emergente.
        parametro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un parametro"));

        //condicion para evaluar si el parametro es un numero positivo
        if (parametro > 0) {
            //ciclo que permite imprimir la serie 
            System.out.println("Tu serie numerica es la siguiente: ");
            while (parametro != 1) {
                //condicion para evaluar si el parametro par para dividirlo entre 2
                if (parametro % 2 == 0) {
                    System.out.print(" " + parametro);
                    parametro /= 2;
                } //cuando el parametro no es par se multiplica por 3 y se le suma 1
                else {
                    System.out.print(" " + parametro);
                    parametro = (parametro * 3) + 1;
                }
                //se imprime el numero cuando el parametro es 1 y termina el ciclo 
                if (parametro == 1) {
                    System.out.print(" " + parametro);
                }
            }
        } else {
            System.out.println(parametro);
        }
    }

    //metodo main para ejecutar el programa 
    public static void main(String args[]) {
        //creacion de objeto para la impresion de la serie 
        Ejercicio1 serie = new Ejercicio1();
        serie.CrearSerie();
    }
}
