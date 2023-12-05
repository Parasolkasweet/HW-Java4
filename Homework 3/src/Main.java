import java.util.Scanner;
// Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. Распечатать на консоль.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write 1st word (odd): ");
        String word1 = sc.next();

        if (word1.length() % 2 != 0) {
            System.out.println("First word not odd. Try again");
            return;
        }
        System.out.print("Write 2d word (even): ");
        String word2 = sc.next();

        if (word2.length() % 2 != 0) {
            System.out.println("Second word not odd. Try again");
            return;
        }

        int halfLength = word1.length() / 2;
        String resultWord = word1.substring(0, halfLength) + word2.substring(halfLength);

        System.out.println("Result: " + resultWord);

    }
}
