package Lab2.zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Stock[] d1 = new Stock[2];
        for (int i=0; i<d1.length;i++)
        {
            System.out.print("������� ��������: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.print("������� ���������: ");
            int cost = scan.nextInt();
            System.out.println("���� �� ����� �� ������?: 1.�� 2.��� ");
            int amount = scan.nextInt();
            d1[i]=new Stock(name,amount,cost);
        }

        for (int i=0; i<d1.length;i++)
        {
            d1[i].Print();
        }
        Stock.Summa(d1);
        Stock.Amounts(d1);
    }
}
