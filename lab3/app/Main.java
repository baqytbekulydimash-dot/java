package app;
import model.Student;
import model.University;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Айбек", 20, "IT");
        Student s2 = new Student("Мадина", 19, "Экономика");
        Student s3 = new Student();
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s3.changeMajor("Дизайн");
        s3.displayInfo();
        University uni = new University("SDU");
        uni.enrollStudent(s1);
        uni.enrollStudent(s2);
        System.out.println("Бағдарлама аяқталды.");
    }
}