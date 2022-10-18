package Lab3.zadanie2;

public class Employee {
    private String name;
    private String gender;
    private String birthday;
    private int work_experience;
    private int salary;

    public Employee(String name, String gender, String birthday, int work_experience, int salary){
        this.name=name;
        this.gender=gender;
        this.birthday=birthday;
        this.work_experience=work_experience;
        this.salary=salary;
    }
    public Employee(){
        this.name="Nickolay";
        this.gender="male";
        this.birthday="26.12.2002";
        this.work_experience=12;
        this.salary=1500;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getWork_experience() {
        return work_experience;
    }

    public void setWork_experience(int work_experience) {
        this.work_experience = work_experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double taxes()
    {
        return salary-salary*0.15;
    }



}