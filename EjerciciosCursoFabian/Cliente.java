import java.util.Scanner;
public class Cliente {
    public static void main(String[] args){              
        String nombreApellido,telefono,ciudad,mail,documentoId;
        int edad;

           /* string  = "telefono";
            string  = "mail";
            string  = "ciudad";
            string  = "documento";*/

            //En las siguientes lineas solicita los datos del cliente y los asigna a las variables antes definidas
        var sc = new Scanner(System.in);  //inicializo el scanner para capturar datos  
        System.out.println("Programa de registro de datos de clientes - Por Fabián Aponte");
        System.out.println("1.Registre el primer nombre y primer apellido del cliente: "); 
        nombreApellido = sc.nextLine();
        System.out.println("2.Registre la edad del cliente: "); 
        edad = sc.nextInt();
        System.out.println("3.Registre el teléfono del cliente: "); 
        telefono = sc.nextLine();  
        System.out.println("4.Registre el mail del cliente: "); 
        mail = sc.nextLine();
        System.out.println("5.Registre la ciudad de origen del cliente: "); 
        ciudad = sc.nextLine();
        System.out.println("6.Registre el documento de identificación del cliente:"); 
        documentoId = sc.nextLine();
        sc.close(); //Cierra el scanner

            //en las siguientes lineas imprimo los datos registrados para el cliente
        System.out.println("Los datos registrados para el cliente son:" );
        System.out.println("Nombre y Apellido:"+ nombreApellido);
        System.out.println("Edad:"+ edad);
        System.out.println("Teléfono:"+telefono);
        System.out.println("Mail:"+mail);
        System.out.println("Ciudad:"+ciudad);
        System.out.println("No de documento de identificación:"+documentoId);
        }
    //System.out.println("El número " + numero + (numero%10==0 ? " es divisible entre 10 " : " no es divisible entre 10")); //combina texto con el if (metodo abreviado con "?:") donde se evalua la condición    
}
