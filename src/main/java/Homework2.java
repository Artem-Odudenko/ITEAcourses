import java.util.Scanner;

public class Homework2
        /*
        ----------------------------------Homework2--------------------------------------------
        Написати програму, яка виведе в консоль текст:

        “The height building ‘height’ m and ‘count’ floors”.

        ‘height’ і ‘count’ - це змінні які можна  вводити через Scanner, або налаштувати в конфігураціях, як на скріні.
        ---------------------------------------------------------------------------------------
        */
{
    public static void main(String[] args)
    {
        System.out.println("Enter the height:");
        Scanner heigth = new Scanner(System.in);
        String h = heigth.nextLine();

        System.out.println("Enter the count:");
        Scanner count = new Scanner(System.in);
        String c = heigth.nextLine();

        System.out.println("The height build " + h + " m and " + c + " floors.");git
    }
}
