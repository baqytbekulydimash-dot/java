package model;
public class University {
    private String universityName;
    public University(String universityName) {
        this.universityName = universityName;
    }
    public void enrollStudent(Student student) {
        System.out.println(student.getName() +
                " студенті " + universityName + " университетіне қабылданды.");
    }
}