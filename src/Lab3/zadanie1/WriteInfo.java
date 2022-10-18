package Lab3.zadanie1;

import Lab3.zadanie1.Factory_Director;
import Lab3.zadanie1.Foreman;
import Lab3.zadanie1.Worker;

public class WriteInfo {
    public static void main(String[] args) {
        Worker worker=new Worker("Shenya", "male", "26.12.2002", 1,
                800,72304,3);
        System.out.println("������� - ���: "+worker.getName()+"; ���: "+ worker.getGender()+"; ���� ��������: "+worker.getBirthday()+
                "; ���� ������: "+ worker.getWork_experience()+"; ��������: "+ worker.getSalary()+ "; ������: "+ worker.getRank()+
                "; ����� ����: "+ worker.getNumber_factory()+";");

        Factory_Director director=new Factory_Director("Alexey", "male", "24.09.1985",20 ,
                2400 , 2);
        System.out.println("�������� ������ - ���: "+director.getName()+"; ���: "+ director.getGender()+"; ���� ��������: "+director.getBirthday()+
                "; ���� ������: "+ director.getWork_experience()+"; ��������: "+ director.getSalary()+ "; ���� ��������: "+ director.getTime_of_election()+
                ";");
        Foreman foreman=new Foreman("Shenya", "male", "06.02.1996", 6,
                1350,"�������",26);
        System.out.println("������� - ���: "+foreman.getName()+"; ���: "+ foreman.getGender()+"; ���� ��������: "+foreman.getBirthday()+
                "; ���� ������: "+ foreman.getWork_experience()+"; ��������: "+ foreman.getSalary()+ "; �������� ����: "+ foreman.getName_factory()+
                "; ���������� �����������: "+ foreman.getCount_workers()+";");
        System.out.println("�������� �������� � ������� ������: "+worker.taxes());
        System.out.println("�������� ��������� � ������� ������: "+director.taxes());
        System.out.println("�������� ���������� ���� � ������� ������: "+foreman.taxes());

    }
}

