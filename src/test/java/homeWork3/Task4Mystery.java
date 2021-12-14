/*
 Задача 2:
Є загадка “If I drink, I die. If I eat, I am fine. What am I?”
Відповідь на питання треба ввести з консолі;
Є три спроби відповісти на питання, після чого програма закінчуєтся;
Якщо ввести “Fire”, в консоль віводится “Great!” та закінчуется цикл
Якщо ввести “I don’t know”, в консоль виводиться “Answer: Fire”  та закінчується циклІнша відповідь,
то виводиться в консоль “Think again” та продовжується цикл
*/

package homeWork3;
import java.util.Scanner;

public class Task4Mystery {

        public static void main (String[] args) {

            System.out.println("If I drink, I die. If I eat, I am fine. What am I?");

            String reply1 = "Fire";
            String reply2 = "I don't know";


            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Your answer:");
                String answer = scanner.nextLine();

                // - порівнюємо об'єкт зі змінною за допомогою методу "equals" зі строкою "Fire"
                if (answer.equals(reply1)) {
                    System.out.println("Great");
                    break;

                }
                // - порівнюємо об'єкт зі змінною за допомогою методу "equals" зі строкою "I don't know"
                if ((answer.equals(reply2))) {
                    System.out.println("Answer: Fire");
                    i = -1;

                }
                else if(i == 2) {
                    System.out.println("All answers are incorrect");

                }
                else{
                    System.out.println("Think again");

                }
            }

        }

}
