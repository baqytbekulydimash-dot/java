public class Task2UniversityName {
    static class Student {
        String name;
        static String university = "ATU";

        Student(String name) {
            this.name = name;
        }

        void showInfo() {
            System.out.println("Name: " + name + ", University: " + university);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aruzhan");
        Student s2 = new Student("Nursultan");

        s1.showInfo();
        s2.showInfo();
    }
}