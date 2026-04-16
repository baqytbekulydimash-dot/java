public class Task1StudentCount {
    static class Student {
        String name;
        int age;
        static int count = 0;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ali", 18);
        Student s2 = new Student("Dana", 19);
        Student s3 = new Student("Madi", 20);

        System.out.println("Students created: " + Student.count);
    }
}