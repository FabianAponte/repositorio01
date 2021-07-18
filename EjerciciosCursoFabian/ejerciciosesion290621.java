/*Programa que indica si un número es divisible por 10 
Por: Fabian Aponte - sesion 29 de julio de 2021
*/

import java.util.Scanner; //importo Scanner


public class ejerciciosesion290621{   //clase principal

public static void main (String[] args) {  //metodo principal

    System.out.println("Programa que indica si un número ingresado es divisible por 10 - por Fabian Aponte"); //Indico al usuario que hace el programa
    var sc = new Scanner(System.in);  //Instancio el Scanner
    System.out.println("Introduce un número entero: "); //Solicito al usuario introducir un número
    var numero=sc.nextInt(); //declaro y asigno a la variable numero el valor introducido por el usuario
    System.out.println(numero%10 ==0 ? "El número es divisible por 10":"El número no es divisible por 10");
    sc.close();
}
}
