package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int result = 2 + 3;
        System.out.println(result);
        // 2. Crea una variable para cada tipo de operación de asignación.
        var x = 3;
        var y = x * 2;

        y += 2;
        x -= 3;

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println("Comparaciones Verdaderas");
        System.out.println(3>2);
        System.out.println(2==2);
        System.out.println(3!=2);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println("Comparaciones Falsas");
        System.out.println(2>=3);
        System.out.println('a' == 'b');
        System.out.println(3 < 2);
        // 5. Utiliza el operador lógico and.

        System.out.println("Operador Logico AND");
        System.out.println("deberia retornar False");
        System.out.println("False && True = False");
        System.out.println(3>4 && 4<5);
        // 6. Utiliza el operador lógico or.
        System.out.println("Operador logico OR");
        System.out.println("deberia retornar True");
        System.out.println("False || True = True");
        System.out.println(3==4 || 3<5);
        // 7. Combina ambos operadores lógicos.
        System.out.println("combinacion");
        System.out.println((3==4 || 3<5) && (3>4 && 4<5));
        System.out.println((3==4 || 3<5) || (3>4 && 4<5));
        // 8. Añade alguna negación.
        System.out.println("negacion");
        System.out.println("Negando True = False");
        System.out.println(!true);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("operadores Unarios");
        var p = 3;
        var q = 5;
        System.out.println(-p);
        System.out.println(--p);
        System.out.println("q:" + q);
        System.out.println(++q);
        System.out.println(--q);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
