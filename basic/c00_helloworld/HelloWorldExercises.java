package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

import java.io.PrintStream;

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        System.out.println("Eduardo Castro");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("hola\nmundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // solucion de ejercicios
        // otro comentario
        // 4. Crea un comentario en varias líneas.
        // definiendo variables
        String nombre = "Eduardo";
        int edad = 23;
        String color = "negro";
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        // usando .format
        System.out.format("Nombre : %s, Edad: %d, Color Favorito: %s \n" ,nombre,edad,color);
        // usando .println
        System.out.println(nombre + " " + edad + " " + color);
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println(" ");
        System.out.print("hola");
        System.out.print("como");
        System.out.print("estas");
        System.out.print("?");
        System.out.println(" ");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        char mychar = 46;
        char mychar2 = 41;
        System.out.println(mychar +" "+ mychar);
        System.out.println(mychar2);
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
            // genera error de ejecucion
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}