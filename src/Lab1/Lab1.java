package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Stock d1 = new Stock();  //�������� ������� d1
//        Stock d2 = new Stock();
        Scanner scan = new Scanner(System.in);

        System.out.print("������� ��������: ");
        String name = scan.next();

        System.out.print("������� ���������: ");
        int cost = scan.nextInt();

        System.out.println("���� �� ����� �� ������?: 1.�� 2.��� ");
        int amount = scan.nextInt();

        d1.setName(name);

        d1.setCost(cost);
        d1.setAmount(amount);//���������� ����� ������� d1 � ������� ��������
//        Stock d1 = new Stock(name, amount, cost);
        String s = d1.getName();//��������� �������� ���� name � ������� �������
        System.out.println("���������� � ������ " + s);
        d1.Print();//����� ���������� �� ������� d1

        Stock d2 = new Stock();

        wClass.Print2(d2);
        wClass.Print2(d1);
    }
}



