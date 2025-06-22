class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String pos, double sal) {
        this.employeeId = id;
        this.name = name;
        this.position = pos;
        this.salary = sal;
    }

    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: ₹" + salary;
    }
}
class EmployeeManager {
    Employee[] employees = new Employee[100];
    int count = 0;

    void addEmployee(Employee e) {
        employees[count++] = e;
    }

    Employee search(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id)
                return employees[i];
        }
        return null;
    }

    void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                break;
            }
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 EmployeeManager manager = new EmployeeManager();	     
	        manager.addEmployee(new Employee(101, "Ravi Kumar", "Software Engineer", 55000));
	        manager.addEmployee(new Employee(102, "Neha Singh", "Project Manager", 75000));
	        manager.addEmployee(new Employee(103, "Arjun Mehta", "Data Analyst", 48000));
	        manager.addEmployee(new Employee(104, "Priya Sharma", "HR Executive", 42000));
	        System.out.println("All Employees:");
	        manager.display();
	        int searchId = 103;
	        Employee found = manager.search(searchId);
	        if (found != null) {
	            System.out.println("\nEmployee Found (ID: " + searchId + "):");
	            System.out.println(found);
	        } else {
	            System.out.println("\nEmployee with ID " + searchId + " not found.");
	        }
	        int deleteId = 102;
	        System.out.println("\nDeleting Employee with ID: " + deleteId);
	        manager.delete(deleteId);
	        System.out.println("\nEmployees after deletion:");
	        manager.display();

	}

}
