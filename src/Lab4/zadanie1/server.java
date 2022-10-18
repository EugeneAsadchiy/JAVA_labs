package Lab4.zadanie1;

import java.io.*;//������ ������, ����������� ������ ���
//�����/������
import java.net.*;//������ ������, ����������� ������ ��� ������ �

//���� Internet
public class server {
    public static void main(String[] arg) {//���������� ������� ������ ServerSocket
        ServerSocket serverSocket = null;
        Socket clientAccepted = null;//���������� ������� ������ Socket
        ObjectInputStream sois = null;//���������� ��������� ������ �����
        ObjectOutputStream soos = null;//���������� ��������� ������ ������
        try {
            System.out.println("server starting....");
            serverSocket = new ServerSocket(2525);//�������� ������ ������� ��� //��������� �����
            clientAccepted = serverSocket.accept();//���������� ������, ������� //������������ �������� ����������� ������� � �������
            System.out.println("connection established....");
//�������� ������ ����� soos = new
            sois = new ObjectInputStream(clientAccepted.getInputStream());
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());//�������� ������
//������

            String clientMessageRecieved = (String) sois.readObject();//���������� //������ � ������������ �� ������ ������ �����, ��������������
//� ���� ������ (�������� ��������)
            System.out.println("message recieved: '" + clientMessageRecieved + "'");
            while (!clientMessageRecieved.equals("exit"))//���������� �����: ����
//������ �� ����� ����� �quite�
            {
                System.out.println("message recieved: '" + clientMessageRecieved + "'");
//                clientMessageRecieved = clientMessageRecieved.toUpperCase();//���������� �������� ������ �
//�������� ��������
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
                        clientMessageRecieved = "������ ������ �� 0";
                    }
                    else{
                        summa=summa*Integer.parseInt(primers[1]);
                        clientMessageRecieved = Integer.toString(summa);
                    }


                }
                soos.writeObject(clientMessageRecieved);//������ ������
//������������� �������� ��������� ���������� (���������� �������)
                clientMessageRecieved = (String) sois.readObject();//������
//������������� ������ ������ �����, �������������� � ���� ������
//(�������� ��������)
            }
        } catch
        (Exception e) {

        } finally {
            try {
                sois.close();//�������� ������ �����
                soos.close();//�������� ������ ������
                clientAccepted.close();//�������� ������, ����������� ��� �������
                serverSocket.close();//�������� ������ �������
            } catch (Exception e) {
                e.printStackTrace();//���������� ����� ���������� �
            }
        }
    }
}

