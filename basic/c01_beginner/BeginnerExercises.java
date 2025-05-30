package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Eduardo";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 31;
        // 3. Crea una variable double con tu altura en metros.
        double height = 1.72;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgram = true;
        // 5. Declara una constante con tu email.
        final String EMAIL = "fecastrop08@gmail.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char init = 'E';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String locality = "Popayan";
        System.out.println(locality);
        locality = "Cali";
        System.out.println(locality);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 3;
        System.out.println(a+b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(((Object)a).getClass().getName());
        System.out.println(((Object)locality).getClass().getName());
        System.out.println(((Object)likeProgram).getClass().getName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String apellido;
        apellido = "Castro";
        System.out.println(apellido);
    }
}
