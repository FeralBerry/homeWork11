import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Реализуйте метод, который получает в качестве параметра год, проверяет,
        является ли он високосным, и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1");
        int year;
        boolean success = false;
        do{
            System.out.println("Введите год для проверки: ");
            try{
                year = Integer.parseInt(sc.next());
                checkYear(year);
                success = true;
            }catch (NumberFormatException ex) {
                System.out.println("Год должен быть цыфрой!");
            }
        } while (!success);
        changeOS();
        success = false;
        int distance;
        do{
            System.out.println("Введите растояние до Вас: ");
            try{
                distance = Integer.parseInt(sc.next());
                changeTime(distance);
                success = true;
            }catch (NumberFormatException ex) {
                System.out.println("Дистанция должна быть указана числом!");
            }
        } while (!success);
    }
    private static void checkYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    private static void changeOS(){
        int minYear = 2000;
        int maxYear = 2023;
        int year = (int) (Math.random() * (maxYear - minYear + 1)) + minYear;
        if(year > 2015 && System.getProperty("os.name").contains("Mac")) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year > 2015 && System.getProperty("os.name").contains("Win")){
            System.out.println("Установите версию приложения для Windows по ссылке");
        } else if (year > 2015 && System.getProperty("os.name").contains("And")){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (year > 2015 && System.getProperty("os.name").contains("X11")){
            System.out.println("Установите версию приложения для UNIX системы по ссылке");
        } else if (year <= 2015 && System.getProperty("os.name").contains("Mac")){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year <= 2015 && System.getProperty("os.name").contains("Win")){
            System.out.println("Установите облегченную версию приложения для Windows по ссылке");
        } else if (year <= 2015 && System.getProperty("os.name").contains("And")){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year <= 2015 && System.getProperty("os.name").contains("X11")){
            System.out.println("Установите облегченную версию приложения для UNIX системы по ссылке");
        }
    }
    private static void changeTime(int distance){
        System.out.println("Расстояние: "+ distance + " км");
        if (distance <= 20){
            System.out.println("Доставка займет сутки");
        } else if (distance <= 60){
            System.out.println("Доставка займет 2 дня");
        } else if (distance <= 100){
            System.out.println("Доставка займет 3 дня");
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }
    }
}