package task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");

        Scanner scanner = new Scanner(System.in);

        int number;

        number = scanner.nextInt();

        System.out.println("Вы ввели число");
        System.out.println(number);

    }
}
