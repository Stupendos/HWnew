import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int j = 2; j <= 17; j = j + 2) {
            System.out.println(j);
        }
        System.out.println("Задача 4");
        for (int w = 10; w >= -10; w--) {
            System.out.println(w);
        }
        System.out.println("Задача 5");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println(s);
        }
        System.out.println("Задача 7");
        for (int q = 1; q <= 512; q = q * 2) {
            System.out.println(q);
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int z = 1; z < 12; z++) {
            System.out.println("Месяц " + z + ",сумма накоплений равна " + (total = salary + total) + " рублей");
        }
        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int u = 1; u < 12; u++) {
            total1 = total1 + salary1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + u + ", сумма накоплений равна " + total1 + " рубелей");
        }
        System.out.println("Задача 10");
        int m = 2;
        for (int p = 1; p <= 10; p++) {
            System.out.println(m + "*" + p + "=" + (m * p));
        }
    }
}