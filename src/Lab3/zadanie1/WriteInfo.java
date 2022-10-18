package Lab3.zadanie1;

import Lab3.zadanie1.Factory_Director;
import Lab3.zadanie1.Foreman;
import Lab3.zadanie1.Worker;

public class WriteInfo {
    public static void main(String[] args) {
        Worker worker=new Worker("Shenya", "male", "26.12.2002", 1,
                800,72304,3);
        System.out.println("Рабочий - Имя: "+worker.getName()+"; Пол: "+ worker.getGender()+"; День Рождения: "+worker.getBirthday()+
                "; Опыт работы: "+ worker.getWork_experience()+"; Зарплата: "+ worker.getSalary()+ "; Разряд: "+ worker.getRank()+
                "; Номер цеха: "+ worker.getNumber_factory()+";");

        Factory_Director director=new Factory_Director("Alexey", "male", "24.09.1985",20 ,
                2400 , 2);
        System.out.println("Директор завода - Имя: "+director.getName()+"; Пол: "+ director.getGender()+"; День Рождения: "+director.getBirthday()+
                "; Опыт работы: "+ director.getWork_experience()+"; Зарплата: "+ director.getSalary()+ "; Срок избрания: "+ director.getTime_of_election()+
                ";");
        Foreman foreman=new Foreman("Shenya", "male", "06.02.1996", 6,
                1350,"Лесовал",26);
        System.out.println("Рабочий - Имя: "+foreman.getName()+"; Пол: "+ foreman.getGender()+"; День Рождения: "+foreman.getBirthday()+
                "; Опыт работы: "+ foreman.getWork_experience()+"; Зарплата: "+ foreman.getSalary()+ "; Название цеха: "+ foreman.getName_factory()+
                "; Количество подчиненных: "+ foreman.getCount_workers()+";");
        System.out.println("Зарплата рабочего с вычетом налога: "+worker.taxes());
        System.out.println("Зарплата директора с вычетом налога: "+director.taxes());
        System.out.println("Зарплата начальника цеха с вычетом налога: "+foreman.taxes());

    }
}

