package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        Integer age = 18;
        if (age >= 18) {
            System.out.println("Puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 8;
        int num2 = 3;

        if (num1 > num2) {
            System.out.println("el numero " + num1 + " es mayor que " + num2);
        } else if (num1 == num2) {
            System.out.println("los numeros son iguales");
        } else {
            System.out.println("el numero " + num2 + " es mayor que " + num1);
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = -4;

        if (numero > 0) {
            System.out.println("El numero es positivo ");
        } else {
            System.out.println("El numero es Negativo");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        int numeroDeUsuario = 2;
        if (numeroDeUsuario % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("numero Impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        if (numeroDeUsuario >= 1 && numeroDeUsuario < 100) {
            System.out.println("El numero esta en el rango");
        } else {
            System.out.println("El numero esta fuera de Rango");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var dayOfTheWeek = 4;
        ;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var starred = 70;
        if (starred > 80) {
            System.out.println("Aprobado");
        } else if (starred > 50) {
            System.out.println("Sobresaliente");
        } else if (starred < 50) {
            System.out.println("Suspendido");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var ageUser = 12;
        boolean acompanado = true;

        if (ageUser >= 15 || acompanado) {
            System.out.println("puedes ingresar");
        } else {
            System.out.println("No puedes ingresar");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letra = "b";
        String[] vocales = {"a", "e", "i", "o", "u"};
        System.out.println(vocales[0]);
        if (Arrays.asList(vocales).contains(letra)) {
            System.out.println("La letra es vocal");
        } else {
            System.out.println("La letra es consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int a = 10;
        int b = 5;
        int c = 9;

        if (a > b && a > c) {
            System.out.println("El numero mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El numero mayor es: " + b);
        } else {
            System.out.println("el numero mayor es: " + c);
        }
        // con Math.max()
        int mayor = Math.max(a,Math.max(b,c));
        System.out.println("Numero mayor con Math.max(): "+ mayor);
    }
}

