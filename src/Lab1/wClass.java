package Lab1;

public class wClass {

    private static wClass inst;
    private wClass(){
    }
    public static wClass getInstance()
    {
        if (inst==null)
        {
            inst=new wClass();

        }
        return inst;
    }

    public static void Print2(Stock stock){
        System.out.println("�2");

        System.out.println("��������: " + stock.getName());
        if(stock.isAmount()==1){
            System.out.println("���� �� ������.");
        }else{
            System.out.println("��� �� ������.");
        }
        System.out.println("���������: " + stock.getCost());
    }

}
