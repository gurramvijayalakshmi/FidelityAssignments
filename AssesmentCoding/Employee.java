package AssesmentCoding;

class Employee {
    int id;
    String name;
    float baseSalary;
    float bonus;
    float netsalary;

    void DisplayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Base Salary: " + baseSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Netsalary: " + netsalary);
    }
}