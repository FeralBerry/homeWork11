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
        // Запуск программы в бесконечный цикл пока не будет получена цифра с клавиатуры
        do{
            System.out.println("Введите год для проверки: ");
            // обработка исключения введения с клавиатуры значения отличного от цифры
            try{
                year = Integer.parseInt(sc.next());
                // вызов метода определения висакосного года с выводом результата
                printIsLeapYearOrNot(year);
                success = true;
            }catch (NumberFormatException ex) {
                System.out.println("Год должен быть цыфрой!");
            }
        } while (!success);
        // запуск метода определяющего операционную систему пользователя и с выводом результата
        printSuggestionForInstallation();
        success = false;
        int distance;
        // Запуск программы в бесконечный цикл пока не будет получена цифра с клавиатуры
        do{
            System.out.println("Введите растояние до Вас: ");
            // обработка исключения введения с клавиатуры значения отличного от цифры
            try{
                distance = Integer.parseInt(sc.next());
                int days = calculateDeliveryDays(distance);
                System.out.println("Расстояние: "+ distance + " км");
                if (days == 1){
                    System.out.println("Доставка займет сутки");
                } else if (days == 2 || days == 3){
                    System.out.println("Доставка займет " + days + " дня");
                } else {
                    System.out.println("Свыше 100км доставки нет.");
                }
                success = true;
            }catch (NumberFormatException ex) {
                System.out.println("Дистанция должна быть указана числом!");
            }
        } while (!success);
    }
    private static void printIsLeapYearOrNot(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    private static void printSuggestionForInstallation(){
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
    private static int calculateDeliveryDays(int distance){
        int days = -1;
        if (distance <= 20 && distance > 0){
            days = 1;
        } else if (distance <= 60){
            days = 2;
        } else if (distance <= 100){
            days = 3;
        }
        return days;
    }
}