package Lab1;

public class Stock {
    private String name;
    private int cost;
    private int amount;

    public void setName(String name){// ����� ����������� ����������� ��������� � ��������� ���{
        this.name = name;
    }

    public void setAmount(int amount){//���������� � �������� �������� {
        this.amount = amount;
    }

    public void setCost(int cost){//���������� � ������ ������ {
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
    {//����� ���������� ������ � ������ �����������, ������������� � ������� ������ setName {
        return name;
    }

    public int isAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }

    public void Print() {
        System.out.println("�1");

        System.out.println("��������: " + name);
        if(amount==1){
            System.out.println("���� �� ������.");
        }else{
            System.out.println("��� �� ������.");
        }
        System.out.println("���������: " + cost);
    }


}

