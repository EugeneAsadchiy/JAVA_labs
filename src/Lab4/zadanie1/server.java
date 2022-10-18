package Lab4.zadanie1;

import java.io.*;//импорт пакета, содержащего классы дл€
//ввода/вывода
import java.net.*;//импорт пакета, содержащего классы дл€ работы в

//сети Internet
public class server {
    public static void main(String[] arg) {//объ€вление объекта класса ServerSocket
        ServerSocket serverSocket = null;
        Socket clientAccepted = null;//объ€вление объекта класса Socket
        ObjectInputStream sois = null;//объ€вление байтового потока ввода
        ObjectOutputStream soos = null;//объ€вление байтового потока вывода
        try {
            System.out.println("server starting....");
            serverSocket = new ServerSocket(2525);//создание сокета сервера дл€ //заданного порта
            clientAccepted = serverSocket.accept();//выполнение метода, который //обеспечивает реальное подключение сервера к клиенту
            System.out.println("connection established....");
//создание потока ввода soos = new
            sois = new ObjectInputStream(clientAccepted.getInputStream());
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());//создание потока
//вывода

            String clientMessageRecieved = (String) sois.readObject();//объ€вление //строки и присваивание ей данных потока ввода, представленных
//в виде строки (передано клиентом)
            System.out.println("message recieved: '" + clientMessageRecieved + "'");
            while (!clientMessageRecieved.equals("exit"))//выполнение цикла: пока
//строка не будет равна Ђquiteї
            {
                System.out.println("message recieved: '" + clientMessageRecieved + "'");
//                clientMessageRecieved = clientMessageRecieved.toUpperCase();//приведение символов строки к
//верхнему регистру
                if (clientMessageRecieved.contains("+")) {
                    int summa = 0;
                    String[] primers = clientMessageRecieved.split("\\+");
                    for (String primer : primers) {
                        summa = summa + Integer.parseInt(primer);
                    }
                    clientMessageRecieved = Integer.toString(summa);
                }
                if (clientMessageRecieved.contains("-")) {
                    int summa = 0;
                    String[] primers = clientMessageRecieved.split("\\-");
                    summa = Integer.parseInt(primers[0]);
                    summa=summa-Integer.parseInt(primers[1]);
                    clientMessageRecieved = Integer.toString(summa);
                }
                if (clientMessageRecieved.contains("*")) {
                    int summa = 0;
                    String[] primers = clientMessageRecieved.split("\\*");
                    summa = Integer.parseInt(primers[0]);
                    summa=summa*Integer.parseInt(primers[1]);
                    clientMessageRecieved = Integer.toString(summa);

                }
                if (clientMessageRecieved.contains("/")) {
                    int summa = 1;
                    String[] primers = clientMessageRecieved.split("/");
                    summa = Integer.parseInt(primers[0]);
                    if (Integer.parseInt(primers[1])==0)
                    {
                        clientMessageRecieved = "Ќельз€ делить на 0";
                    }
                    else{
                        summa=summa*Integer.parseInt(primers[1]);
                        clientMessageRecieved = Integer.toString(summa);
                    }


                }
                soos.writeObject(clientMessageRecieved);//потоку вывода
//присваиваетс€ значение строковой переменной (передаетс€ клиенту)
                clientMessageRecieved = (String) sois.readObject();//строке
//присваиваютс€ данные потока ввода, представленные в виде строки
//(передано клиентом)
            }
        } catch
        (Exception e) {

        } finally {
            try {
                sois.close();//закрытие потока ввода
                soos.close();//закрытие потока вывода
                clientAccepted.close();//закрытие сокета, выделенного дл€ клиента
                serverSocket.close();//закрытие сокета сервера
            } catch (Exception e) {
                e.printStackTrace();//вызываетс€ метод исключени€ е
            }
        }
    }
}

