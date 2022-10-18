package Lab4.zadanie2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException { // ���������, ��� ������ ����� ����� ����������� IOException
        DatagramSocket datagramSocket = new DatagramSocket(1409); // �������� ������ ���������� � ��������� ����� 1409
        DatagramPacket datagramPacket; // ���������� ������ ����������
        InetAddress inetAddress = InetAddress.getByName("localhost");
        byte[] bytes = new byte[100];
        new Scanner(System.in);
        char array[] = {'x', 'y', 'z'};// ������ ��� ���������� ���� ����������, �������� ������� ����� ������ ������������
        for (char i : array) { // ��������� ���� for-each
            System.out.print("Enter " + i + ": ");
            int length = System.in.read(bytes); // ��������� � ���������� ������ ��� ����������
            datagramPacket = new DatagramPacket(bytes, length, inetAddress, 1408);
            datagramSocket.send(datagramPacket);
        }
        datagramPacket = new DatagramPacket(bytes, 100);
        datagramSocket.receive(datagramPacket);// ��������� ������ �� �������
        System.out.println("The answer is " + new String(datagramPacket.getData()));
        datagramSocket.close();// �������� ������ ���������
    }
}

