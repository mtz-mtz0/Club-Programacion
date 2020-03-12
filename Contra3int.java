//Bernardo M.
import java.util.Scanner;
public class Contra3int{
	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int contra1=12345;
            int contra2=0;
            int contra3=0;
            
            System.out.println("Ingresa la contraseña de 5 digitos");
            contra2=(int)in.nextInt();
            
            System.out.println("Confirma tu contraseña");
            contra3=(int)in.nextInt();
                    
            if(contra1==contra2 && contra2== contra3){
                System.out.println("Contraseña correcta");
            }else{
                System.out.println("Contraseña incorrecta");
            }
	}
}