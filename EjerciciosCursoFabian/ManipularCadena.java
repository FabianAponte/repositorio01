public class ManipularCadena { //Método principal
    public static void main(String[] args){        
	var cadena = "El perro (Canis familiaris o Canis lupus familiaris dependiendo de si se lo considera una especie por derecho propio o una subespecie del lobo"; //asigno valor a la variable cadena
        System.out.println("EJERCICIO DE MANIPULACIÓN DE CADENAS Por: Fabian Aponte");//Introducción
	System.out.println("Tenemos la siguiente cadena: "+cadena); //Imprimo cadena
        int longitud = cadena.length(); //Asigno a la variable longitud el resultado del método length aplicado a la cadena para obtener la longitud de la cadena
        System.out.println("La longitud de la cadena es: "+ longitud +" caracteres"); //Imprimo la longitud de la cadena
        int primerIndice=cadena.indexOf('a'); //Asigno a la variable primerIndice el indice de la primera posición en que se encuentra el caracer 'a'
        System.out.println("El indice del primer caracter a de la cadena es: "+ primerIndice); //Imprimo la primera posición de la cadena en que se encuentra el caracer 'a'
        System.out.println("El caracter de la posición 11 en la cadena es la letra: " +cadena.charAt(11)); //Aplico el método charAt() en la posición 11 de la cadena
        System.out.println("La subcadena formada por los caracteres que se encuentran entre la posición 70 a la 109 es: " +cadena.substring(70,110)); //Extraigo una subcadena de la cadena
        System.out.println("Si pasamos a mayúsculas la subcadena anterior obtendremos lo siguiente: "+ cadena.substring(70,110).toUpperCase()); //Con toUpperCase() paso a mayusculas una cadena o subcadena
        System.out.println("Si pasamos a minusculas la subcadena que se encuentra entre la posición 10 y 14 obtendremos lo siguiente: "+ cadena.substring(10,15).toLowerCase()); //Con toLowerCase() paso a minúsculas una cadena o subcadena
        System.out.println("Si eliminamos los espacios en blanco en ambos extremos de la subcadena que se encuentra entre la posición 15 y 26 obtendremos lo siguiente: "+cadena.substring(15,27).trim()); //Con trim() eliminamos espacios en blaco al principio y final de una cadena o subcadena
    }
}