import java.util.*;
 
class Palindrome {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
      
    String Pregunta = "si";
        
        do {
            
            String pal = "palindromo"; 
            switch(pal) { 
            
                case "palindromo": 
                String normal, reversa = ""; 
                
                Scanner in = new Scanner(System.in);
     
                System.out.print("Ingresa la palabra: ");
                normal = in.nextLine();
     
                int length = normal.length();

                for (int i = length - 1; i >= 0; i--)
                   reversa = reversa + normal.charAt(i);

                if (normal.equals(reversa))
                   System.out.println("Sí es palíndromo.");

                else
                   System.out.println("No es palíndromo");

                break;        
                }
                    
                Scanner entrada=new Scanner(System.in);
                System.out.println(" ");
                System.out.print("¿Desea ingresar otra palabra? (si/no): ");
                Pregunta=sc.nextLine();
                System.out.println(" ");
                
            } while (Pregunta.equals("si")); {
            
                System.out.println("Fin del programa");
        
                }

       }
      
   }
