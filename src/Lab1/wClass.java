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
        System.out.println("№2");

        System.out.println("Название: " + stock.getName());
        if(stock.isAmount()==1){
            System.out.println("Есть на складе.");
        }else{
            System.out.println("Нет на складе.");
        }
        System.out.println("Стоимость: " + stock.getCost());
    }

}
