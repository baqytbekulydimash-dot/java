package model;
public class Student {
    private String name;
    private int age;
    private String major;
    public Student() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Анықталмаған";
        System.out.println("Әдепкі конструктор шақырылды");
    }
    public Student(String name, int age, String major) {
        this.name = name;     // this өрісті параметрден ажыратады
        this.age = age;
        this.major = major;
        System.out.println("Параметрлі конструктор шақырылды");
    }
    public void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
    public String getName() {
        return name;
    }
}