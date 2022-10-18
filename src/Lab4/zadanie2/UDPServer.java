package Lab4.zadanie2;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;

public  class UDPServer {

    private static DatagramSocket datagramSocket; // объявление сокета дейтаграмм, объявлен как глобальная переменная
    // для удобства, т.к он будет ипользоваться в двух разных функциях
    public static void main(String[] args) throws IOException {
        byte [] bytes = new byte[100];
        final int x, y, z; //Переменные, в которые будут записаны значения, пришедшие от клиента
        DatagramPacket datagramPacket = new DatagramPacket(bytes,100);
        datagramSocket = new DatagramSocket(1408); // Непосредсвенное выделение памяти и создание для сокета дейтаграм
        System.out.println("Waiting for a connection..");
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData()); //строка составленная из массива передаваемых в пакете байтов
        str = str.substring(0, str.indexOf('\n')); // Переопределяем существующую строку подстрокой по символу переноса строки
        System.out.println("x: " + str);
        x = Integer.parseInt(str); // Парсим строку в тип данных int с помощью статического метода класса Integer
        // Далее происходит все то же самое, но уже для перемнных x и y
        datagramSocket.receive(datagramPacket);
        str = new String(datagramPacket.getData());
        str = str.substring(0, str.indexOf('\n'));
        System.out.println("y: " + str);
        y = Integer.parseInt(str);
        datagramSocket.receive(datagramPacket);
        str = new String(datagramPacket.getData());
        str = str.substring(0, str.indexOf('\n'));
        System.out.println("z: " + str);
        z = Integer.parseInt(str);
        sendBack(datagramPacket, allMagicIsHere(x, y, z)); //Вызываем функцию sendBack(34 строка) и
        // передаем в нее объект datagramPacket, а так же вызываем функцию allMagicIsHere(44 строка),
        // результат которой есть некоторое значение типа даннх double. В функцию allMagicIsHere передаем
        // в параметры значения переменных, уже переведенных в int
    }

    private static void sendBack(DatagramPacket datagramPacket, double result) throws IOException { //Функция для отправки ответа клиенту
        String string = String.valueOf(result);
        System.out.println("Sending back to client " + string);
        byte [] bytes = string.getBytes();
        datagramPacket = new DatagramPacket(bytes, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort() );
        datagramSocket.send(datagramPacket); // Отправляем пакет обратно клиенту
        datagramSocket.close(); // Закрываем сокет дейтаграмм
    }
    private static double allMagicIsHere(int x, int y, int z){ //Функция для математических расчетов в результате которой будет значение типа double
        double res1 = Math.log(Math.pow(y,-Math.sqrt(Math.abs(x))));


        double res2 = (x-y/2); //tg
        double res3 = Math.pow(Math.sin(Math.atan(z)),2) ; // Возведение в степень
        double res4 = Math.exp(x)*Math.exp(y);
        double res5=res1*res2+res3+res4;

        saveInFile(x, y, z, res5); // Вызываем функцию saveInFile для сохранения значений в файл
        //и передаем все необходимые данные
        return res5; //Результатом работы функции будет некоторое значение типа данных double
    }
    private static void saveInFile(int x, int y, int z, double result){ //Функция для записи в файл исходных параметров и ответа
        String string = "Значение x: " + x + "\n" +
                "Значение y: " + y + "\n" +
                "Значение z: " + z + "\n" +
                "Ответ: " + result + ".";
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("History.txt", true); //append=true - Для возможности дописывать даные файл без потери содержимого
            fileWriter.write(string + "\n\n");//Зываем в файл. Для удобства записи будут отделяться двумя переносами строки
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
