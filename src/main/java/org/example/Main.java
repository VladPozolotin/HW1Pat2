package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу значений:");
        int t = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список");
        List<Integer> rand = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i < n; i++){
            int a = random.nextInt(t);
            rand.add(a);
        }
        System.out.println("Полученный список: " + rand);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int p = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(p);
        List<Integer> res = filter.filterOut(rand);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + res);
        logger.log("Завершаем программу");
    }
}