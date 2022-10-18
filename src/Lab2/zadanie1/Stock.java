package Lab2.zadanie1;

public class Stock
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

    public Stock(String name, int amount,int cost)
    {
        this.name=name;
        this.amount=amount;
        this.cost=cost;
    }

    public  Stock()
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
    public static void Summa(Stock[] d1)
    {
        int c=0;
        for (int i=0; i<d1.length;i++)
        {
            c=c+d1[i].getCost();
        }
        System.out.println("Общая стоимость товаров: "+c);
//        return c;
    }
    public static void Amounts(Stock[] d1)
    {
        int am = 0;
        for (int i = 0; i < d1.length; i++)
        {
            if (d1[i].getAmount() == 1)
            {
                am = am + d1[i].getAmount();
            }
        }
        System.out.println("Количество товаров на складе: "+am);
    }

}






