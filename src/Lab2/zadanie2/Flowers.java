package Lab2.zadanie2;


import java.util.ArrayList;
import java.util.Scanner;

public class Flowers
{
    private String name;
    private int cost;
    private int amount;

    public void setName(String name){this.name = name;}
    public void setAmount(int amount){//аналогично с наличием лицензии {
        this.amount = amount;
    }

    public void setCost(int cost){//аналогично с суммой дохода {
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
    {//метод возвращает строку с именем подпроцесса, установленным с помощью вызова setName {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }


    public void Print() {


        System.out.println("Название: " + name);
        if(amount==1){
            System.out.println("Есть на складе.");
        }else{
            System.out.println("Нет на складе.");
        }
        System.out.println("Стоимость: " + cost);
        System.out.println();
    }
    int c=0;


    public static void output_flowers(ArrayList<Flowers> flowersArrayList)
    {
        int i=1;
        for (Flowers el: flowersArrayList)
        {

            System.out.println("Информация о букете №" +i+": Название: "+ el.getName() +". Количество: "+ el.getAmount());
            i++;
        }
    }
    public static void del_flowers(ArrayList<Flowers> flowersArrayList)
    {
        int i=1;
        for (Flowers el: flowersArrayList)
        {

            System.out.println("Информация о букете №" + i +": Название: "+ el.getName() +". Количество: "+ el.getAmount());
            i++;
        }
        System.out.print("Введите номер, который хотите удалить: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        flowersArrayList.remove(number-1);
    }

}

