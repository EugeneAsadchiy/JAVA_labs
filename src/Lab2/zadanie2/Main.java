package Lab2.zadanie2;

import Lab2.zadanie1.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <Flowers> flowers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        int f=0;
        while (f!=1)
        {
            Flowers d1=new Flowers();
            System.out.println("1. ������� �����");
            System.out.println("2. ����������� ��� ������");
            System.out.println("3. ������� �����");
            System.out.println("4. �����");
            int number = scan.nextInt();
            switch (number)
            {
                case 1:
                    System.out.print("������� ��������: ");
                    String name = scan.next();
                    System.out.print("������� ����������: ");
                    d1.setName(name);
                    int amount = scan.nextInt();
                    d1.setAmount(amount);
                    flowers.add(d1);
                    break;
                case 2:

                    Flowers.output_flowers(flowers);
                    break;
                case 3:
                    Flowers.del_flowers(flowers);
                    break;
                case 4:
                    System.out.println("�����...");
                    f=1;
                    break;
            }
//            flowerslist.add(new Flowers("����"));
        }


     }

}
