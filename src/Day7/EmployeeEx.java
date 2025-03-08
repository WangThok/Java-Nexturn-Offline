
abstract class Employee {

    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + employeeId);
    }

    abstract void calculatesalary();
}

class fte extends Employee {

    int salary = 50000;

    fte(String name, int employeeId) {
        super(name, employeeId);
    }

    void calculatesalary() {
        System.out.println("Salary : " + salary);
    }
}

class pte extends Employee {

    int rate = 500;
    int hrs;

    public pte(String name, int employeeId, int hrs) {
        super(name, employeeId);
        this.hrs = hrs;
    }

    void calculatesalary() {
        int salary = rate * hrs;
        System.out.println("Salary : " + salary);
    }
}
public class EmployeeEx {
    public static void main(String[] args) {
        Employee e1=new fte("Wang",123);
        e1.showDetails();
        e1.calculatesalary();
        System.out.println();

        Employee e2=new pte("Thokz",456,28);
        e2.showDetails();
        e2.calculatesalary();

    }
}


