/*-------------------------------------------
---Elaborado por: Martinez Santos Bernardo---
---------------------------------------------*/
import javax.swing.JOptionPane;

public class Ejercicio2 {
    //Variables para alojar el numero dado y resultado 
    private int numero, resultado;

    //metodo para pedir el numero;
    public void Entrada(){
    	numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
    }

    //metodo para imprimir el numero;
    public void Salida(){
    	JOptionPane.showMessageDialog(null,"La  suma de los digitos es: "+resultado);
    }

    //metodo para realizar la suma 
    public void suma() {

        //ciclo para separar los digitos
        while (numero != 0) {
            resultado += numero % 10;
            numero /= 10;
        }
        //condicion para evaluar si el resultado aun tiene numeros por sumar
        if(resultado>=10){
        	numero=resultado;
        	resultado=0;
      		while (numero != 0) {
            	resultado += numero % 10;
            	numero /= 10;
        	}
        }      
    }

    //metodo principal para ejecutar el programa
    public static void main(String[] args){

        //creacion de objeto para imprimir el resultado
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.Entrada();
        ejercicio.suma();
        ejercicio.Salida();

    }
}
