package Lab1;

public class Stock {
    private String name;
    private int cost;
    private int amount;

    public void setName(String name){// метод присваивает подпроцессу указанное в параметре имя{
        this.name = name;
    }

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

    public int isAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }

    public void Print() {
        System.out.println("№1");

        System.out.println("Название: " + name);
        if(amount==1){
            System.out.println("Есть на складе.");
        }else{
            System.out.println("Нет на складе.");
        }
        System.out.println("Стоимость: " + cost);
    }


}

