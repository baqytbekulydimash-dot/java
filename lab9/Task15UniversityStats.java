public class Task15UniversityStats {
    static class University {
        static int studentCount = 0;

        void addStudent() {
            studentCount++;
        }

        void showStudentCount() {
            System.out.println("Total students: " + studentCount);
        }
    }

    public static void main(String[] args) {
        University u1 = new University();
        u1.addStudent();
        u1.addStudent();
        u1.addStudent();

        u1.showStudentCount();
    }
}