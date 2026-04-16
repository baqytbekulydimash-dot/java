public class Task13CompanySystem {
    static class Company {
        class Employee {
            String name;
            String position;

            Employee(String name, String position) {
                this.name = name;
                this.position = position;
            }

            void showInfo() {
                System.out.println("Employee: " + name + ", Position: " + position);
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        Company.Employee employee = company.new Employee("Dias", "Manager");
        employee.showInfo();
    }
}