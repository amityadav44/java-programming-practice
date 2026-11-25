package Challlenge79;

public class TextEmployrr {
    public static void main(String[] args) {
        Employee emp = new Employee("amit",30,25000000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Abhi");
        System.out.println(emp.getEmployeeDetails());
    }

}
