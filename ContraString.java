Bernardo M.
import java.util.Scanner;
public class ContraString {
    public static void main(String args[]){
    
        Scanner in = new Scanner(System.in);
        
        String Contrag ="hola";
        String ContraIngresar="";
        
        System.out.println("Ingresa la contraseña de 10 caracteres");
            ContraIngresar=(String)in.nextLine();
            
            if(Contrag.equalsIgnoreCase(ContraIngresar)){
                System.out.println("Contraseña correcta");
            }else{
                System.out.println("Contraseña incorrecta");
            }
    }
}
