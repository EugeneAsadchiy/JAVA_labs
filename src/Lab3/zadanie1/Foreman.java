package Lab3.zadanie1;

import Lab3.zadanie1.Employee;

public class Foreman extends Employee {
    private String name_factory;
    private int count_workers;

    public Foreman(String name, String gender, String birthday, int work_experience, int salary, String name_factory, int count_workers){
        super(name,gender,birthday,work_experience,salary);
        this.name_factory=name_factory;
        this.count_workers=count_workers;
    }

    public String getName_factory() {
        return name_factory;
    }

    public void setName_factory(String name_factory) {
        this.name_factory = name_factory;
    }

    public int getCount_workers() {
        return count_workers;
    }

    public void setCount_workers(int count_workers) {
        this.count_workers = count_workers;
    }
}
