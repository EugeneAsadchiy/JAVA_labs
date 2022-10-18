package Lab4.zadanie2;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;

public  class UDPServer {

    private static DatagramSocket datagramSocket; // ���������� ������ ����������, �������� ��� ���������� ����������
    // ��� ��������, �.� �� ����� ������������� � ���� ������ ��������
    public static void main(String[] args) throws IOException {
        byte [] bytes = new byte[100];
        final int x, y, z; //����������, � ������� ����� �������� ��������, ��������� �� �������
        DatagramPacket datagramPacket = new DatagramPacket(bytes,100);
        datagramSocket = new DatagramSocket(1408); // ��������������� ��������� ������ � �������� ��� ������ ���������
        System.out.println("Waiting for a connection..");
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData()); //������ ������������ �� ������� ������������ � ������ ������
        str = str.substring(0, str.indexOf('\n')); // �������������� ������������ ������ ���������� �� ������� �������� ������
        System.out.println("x: " + str);
        x = Integer.parseInt(str); // ������ ������ � ��� ������ int � ������� ������������ ������ ������ Integer
        // ����� ���������� ��� �� �� �����, �� ��� ��� ��������� x � y
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
        sendBack(datagramPacket, allMagicIsHere(x, y, z)); //�������� ������� sendBack(34 ������) �
        // �������� � ��� ������ datagramPacket, � ��� �� �������� ������� allMagicIsHere(44 ������),
        // ��������� ������� ���� ��������� �������� ���� ����� double. � ������� allMagicIsHere ��������
        // � ��������� �������� ����������, ��� ������������ � int
    }

    private static void sendBack(DatagramPacket datagramPacket, double result) throws IOException { //������� ��� �������� ������ �������
        String string = String.valueOf(result);
        System.out.println("Sending back to client " + string);
        byte [] bytes = string.getBytes();
        datagramPacket = new DatagramPacket(bytes, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort() );
        datagramSocket.send(datagramPacket); // ���������� ����� ������� �������
        datagramSocket.close(); // ��������� ����� ����������
    }
    private static double allMagicIsHere(int x, int y, int z){ //������� ��� �������������� �������� � ���������� ������� ����� �������� ���� double
        double res1 = Math.log(Math.pow(y,-Math.sqrt(Math.abs(x))));


        double res2 = (x-y/2); //tg
        double res3 = Math.pow(Math.sin(Math.atan(z)),2) ; // ���������� � �������
        double res4 = Math.exp(x)*Math.exp(y);
        double res5=res1*res2+res3+res4;

        saveInFile(x, y, z, res5); // �������� ������� saveInFile ��� ���������� �������� � ����
        //� �������� ��� ����������� ������
        return res5; //����������� ������ ������� ����� ��������� �������� ���� ������ double
    }
    private static void saveInFile(int x, int y, int z, double result){ //������� ��� ������ � ���� �������� ���������� � ������
        String string = "�������� x: " + x + "\n" +
                "�������� y: " + y + "\n" +
                "�������� z: " + z + "\n" +
                "�����: " + result + ".";
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("History.txt", true); //append=true - ��� ����������� ���������� ����� ���� ��� ������ �����������
            fileWriter.write(string + "\n\n");//������ � ����. ��� �������� ������ ����� ���������� ����� ���������� ������
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
