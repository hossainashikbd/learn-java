package January5;

public class EmployeeTable {
    private String name;
    private int yearOfJoining;
    private String address;

    public EmployeeTable(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayDetails() {
        System.out.printf("%-12s %-18d %-20s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        System.out.printf("%-12s %-18s %-20s\n", "Name", "Year of Joining", "Address");

        EmployeeTable e1 = new EmployeeTable("Rahul", 1994, "Tilak Nagar, New Delhi");
        EmployeeTable e2 = new EmployeeTable("Raman", 2000, "Hari Nagar, New Delhi");
        EmployeeTable e3 = new EmployeeTable("Rohit", 1999, "Subash Nagar, New Delhi");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
