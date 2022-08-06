public class Main {
    public static void main(String[] args) {
        // задание 1
        int clientOS1 = 0;
        if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
        // задание 2
        int clientOs = 0;
        int yearOfProduction = 2014;
        if (clientOs == 1 && yearOfProduction >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && yearOfProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOs == 0 && yearOfProduction >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && yearOfProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }}
