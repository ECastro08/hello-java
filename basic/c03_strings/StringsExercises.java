package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String ciudad = "Popayan";
        String pais = "Colombia";
        int fundacion = 1835;

        System.out.println(pais +" "+ ciudad);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(ciudad.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(ciudad.charAt(0) + "" + ciudad.charAt(ciudad.length()-1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(ciudad.toUpperCase());
        System.out.println(ciudad.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(ciudad.contains("Pop"));
        // 6. Formatea un string con un entero.
        System.out.format("ciudad %s, fundacion %d", ciudad, fundacion);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        String saludo = " Hola como estan ";
        System.out.println(" ");
        System.out.println(saludo);
        System.out.println(saludo.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(saludo.replace(" ","-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println("abc" == "ABC");
        System.out.println("abc" == "abc");
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("abc".length() == "uno".length());
    }
}
