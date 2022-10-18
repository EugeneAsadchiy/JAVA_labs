package Lab3.zadanie1;

import Lab3.zadanie1.Employee;

public class Worker extends Employee {
    private int number_factory;
    private int rank;

    public Worker(String name, String gender, String birthday, int work_experience, int salary, int number_factory, int rank){
        super(name,gender,birthday,work_experience,salary);
        this.number_factory=number_factory;
        this.rank=rank;
    }

    public int getNumber_factory() {
        return number_factory;
    }

    public void setNumber_factory(int number_factory) {
        this.number_factory = number_factory;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
