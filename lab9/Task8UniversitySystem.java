public class Task8UniversitySystem {
    static class University {
        class Student {
            String name;
            String major;

            Student(String name, String major) {
                this.name = name;
                this.major = major;
            }

            void showInfo() {
                System.out.println("Student: " + name + ", Major: " + major);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        University.Student student = university.new Student("Ayan", "Information Systems");
        student.showInfo();
    }
}