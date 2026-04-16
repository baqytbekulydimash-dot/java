public class Task14CourseSystem {
    static class Course {
        String courseName;

        Course(String courseName) {
            this.courseName = courseName;
        }

        class Student {
            String studentName;

            Student(String studentName) {
                this.studentName = studentName;
            }

            void showInfo() {
                System.out.println("Course: " + courseName + ", Student: " + studentName);
            }
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Course.Student student = course.new Student("Kamila");
        student.showInfo();
    }
}