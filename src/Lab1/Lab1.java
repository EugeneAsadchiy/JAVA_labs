package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Stock d1 = new Stock();  //создание объекта d1
//        Stock d2 = new Stock();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите название: ");
        String name = scan.next();

        System.out.print("Введите стоимость: ");
        int cost = scan.nextInt();

        System.out.println("Есть ли товар на складе?: 1.да 2.нет ");
        int amount = scan.nextInt();

        d1.setName(name);

        d1.setCost(cost);
        d1.setAmount(amount);//заполнение полей объекта d1 с помощью сеттеров
//        Stock d1 = new Stock(name, amount, cost);
        String s = d1.getName();//получение значения поля name с помощью геттера
        System.out.println("Информация о складе " + s);
        d1.Print();//вывод информации об объекте d1

        Stock d2 = new Stock();

        wClass.Print2(d2);
        wClass.Print2(d1);
    }
}



