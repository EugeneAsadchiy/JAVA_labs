package Lab3.zadanie2;

import Lab3.zadanie1.Employee;

public class Factory_Director extends Employee {
    private int time_of_election;

    public Factory_Director(String name, String gender, String birthday, int work_experience, int salary, int time_of_election){
        super(name,gender,birthday,work_experience,salary);
        this.time_of_election=time_of_election;

    }

    public int getTime_of_election() {
        return time_of_election;
    }

    public void setTime_of_election(int time_of_election) {
        this.time_of_election = time_of_election;
    }
}
