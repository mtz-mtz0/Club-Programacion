Bernardo M.
import java.util.Scanner;
public class ContraInt{
	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //La primera variable representa la contraseña guardada
            //la segunda variable la contraseña a ingresar
            int Cguardado=12345;
            int Cingresar=0;
            
            System.out.println("Ingresa la contraseña de 5 digitos");
            Cingresar=(int)in.nextInt();
            
            if(Cguardado != Cingresar){
                System.out.println("Contraseña incorrecta");
            }else{
                System.out.println("Contraseña correcta");
            }
	}
}