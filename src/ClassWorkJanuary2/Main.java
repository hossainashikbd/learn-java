package ClassWorkJanuary2;

class Employee {

    public void work() {
        System.out.println("Employee is working.");
    }

    public int getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {

    @Override
    public void work() {
        System.out.println("HR Manager is managing employee relations and recruitment.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.println("Employee:");
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        System.out.println();

        HRManager hr = new HRManager();
        System.out.println("HR Manager:");
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}

