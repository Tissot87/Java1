package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        guess();


    }

    public static void guess() {
        Random rand = new Random();
        int answer = rand.nextInt(10);
        int maxTryCount = 3;
        int tryCount = 0;
        System.out.println("Введите число от 0 до 9");
        for (int i = 0; i < maxTryCount; i++) {
            tryCount++;
            Scanner scr = new Scanner(System.in);
            int userAnswer = scr.nextInt();
            if (userAnswer == answer) {
                System.out.println("Вы отгадали!");
                break;
            } else if (tryCount == maxTryCount) {
                System.out.println("Попытки кончились. Вы проиграли! Правильный ответ " + answer);
                break;
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число");
            } else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком большое число");
            }

        }
    }


}

