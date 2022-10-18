package Lab2.zadanie2;


import java.util.ArrayList;
import java.util.Scanner;

public class Flowers
{
    private String name;
    private int cost;
    private int amount;

    public void setName(String name){this.name = name;}
    public void setAmount(int amount){//���������� � �������� �������� {
        this.amount = amount;
    }

    public void setCost(int cost){//���������� � ������ ������ {
        this.cost = cost;
    }

    public Flowers(String name, int amount,int cost)
    {
        this.name=name;
        this.amount=amount;
        this.cost=cost;
    }

    public  Flowers()
    {
        name="Alesha";
        amount=1;
        cost=5000;
    }

    public String getName()
    {//����� ���������� ������ � ������ �����������, ������������� � ������� ������ setName {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }


    public void Print() {


        System.out.println("��������: " + name);
        if(amount==1){
            System.out.println("���� �� ������.");
        }else{
            System.out.println("��� �� ������.");
        }
        System.out.println("���������: " + cost);
        System.out.println();
    }
    int c=0;


    public static void output_flowers(ArrayList<Flowers> flowersArrayList)
    {
        int i=1;
        for (Flowers el: flowersArrayList)
        {

            System.out.println("���������� � ������ �" +i+": ��������: "+ el.getName() +". ����������: "+ el.getAmount());
            i++;
        }
    }
    public static void del_flowers(ArrayList<Flowers> flowersArrayList)
    {
        int i=1;
        for (Flowers el: flowersArrayList)
        {

            System.out.println("���������� � ������ �" + i +": ��������: "+ el.getName() +". ����������: "+ el.getAmount());
            i++;
        }
        System.out.print("������� �����, ������� ������ �������: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        flowersArrayList.remove(number-1);
    }

}

