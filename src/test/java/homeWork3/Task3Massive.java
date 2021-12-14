/*
Задача 1:
Дано масив {15, 8, 24, 41, 9, 84}. Необхідно отримати випадкове число з масива. Я
кщо число парне, вивести напис “I am lucky”, в протилежному випадку “Run again”.
*/


package homeWork3;

import java.lang.reflect.Array;
import java.util.Random;

public class Task3Massive {
    public static void main(String[] args) {
        int[] array = {15, 8, 24, 41, 9, 84};

        Random random = new Random();
        int arrayAmount = random.nextInt(array.length);

//        1. - Варіант присвоєння виведеного числа з масиву
//
        int arrayNamber;
        arrayNamber = array[arrayAmount];
        System.out.println(arrayNamber);

//        2. - Варіант виведеня числа в консоль
//
//        System.out.println(array[arrayAmount]);




    }
}
