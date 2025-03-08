class Employee {
    String fullName;
    int pointLevel;
    Category assignedCategory;

    public Employee(String fullName, int pointLevel, Category assignedCategory) {
        this.fullName = fullName;
        this.pointLevel = pointLevel;
        this.assignedCategory = assignedCategory;
    }
}

class Ticket {
    int id;
    String name;
    Category category;
    int point;
    String assignedEmployee;
    boolean isCompleted;

    public Ticket(int id, String name, Category category, int point) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.point = point;
        this.assignedEmployee = "";
        this.isCompleted = false;
    }
}

class HelpDesk {
    Employee emp1, emp2;
    Ticket t1, t2, t3, t4, t5;

    public void addEmployee(Employee e, int pos) {
        if (pos == 1) {
            emp1 = e;
        } else if (pos == 2) {
            emp2 = e;
        }
    }

    public void addTicket(Ticket t, int pos) {
        switch (pos) {
            case 1: t1 = t; break;
            case 2: t2 = t; break;
            case 3: t3 = t; break;
            case 4: t4 = t; break;
            case 5: t5 = t; break;
        }
    }

    // Method to mark a ticket as completed
    public void completeTicket(String employeeName, int ticketId) {
        Employee emp = null;
        Ticket ticket = null;

        if (emp1 != null && emp1.fullName.equals(employeeName)) {
            emp = emp1;
        } else if (emp2 != null && emp2.fullName.equals(employeeName)) {
            emp = emp2;
        }

        switch (ticketId) {
            case 101: ticket = t1; break;
            case 102: ticket = t2; break;
            case 103: ticket = t3; break;
            case 104: ticket = t4; break;
            case 105: ticket = t5; break;
        }

        // Check if the employee and ticket exist and the ticket is not already completed
        if (emp != null && ticket != null && !ticket.isCompleted) {
            // Check if the employee's skill level is sufficient to handle the ticket
            if (emp.pointLevel >= ticket.point && emp.assignedCategory == ticket.category) {
                ticket.isCompleted = true;
                ticket.assignedEmployee = employeeName;
                System.out.println("Ticket " + ticketId + " marked as completed by " + employeeName + ".");
            } else {
                System.out.println("Ticket " + ticketId + " cannot be completed by " + employeeName + " (Insufficient points).");
            }
        } else {
            System.out.println("Ticket " + ticketId + " cannot be completed (Ticket does not exist or already completed).");
        }
    }

    public int getWaitingTicketCount() {
        int count = 0;
        if (t1 != null && !t1.isCompleted) count++;
        if (t2 != null && !t2.isCompleted) count++;
        if (t3 != null && !t3.isCompleted) count++;
        if (t4 != null && !t4.isCompleted) count++;
        if (t5 != null && !t5.isCompleted) count++;
        return count;
    }

    public int getCompletedTicketsTotalPoint() {
        int totalPoints = 0;
        if (t1 != null && t1.isCompleted) totalPoints += t1.point;
        if (t2 != null && t2.isCompleted) totalPoints += t2.point;
        if (t3 != null && t3.isCompleted) totalPoints += t3.point;
        if (t4 != null && t4.isCompleted) totalPoints += t4.point;
        if (t5 != null && t5.isCompleted) totalPoints += t5.point;
        return totalPoints;
    }
}

public class HelpdeskMS {
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        Employee alice = new Employee("Alice Brown", 5, Category.SOFTWARE);
        Employee bob = new Employee("Bob Smith", 8, Category.HARDWARE);
        helpDesk.addEmployee(alice, 1);
        helpDesk.addEmployee(bob, 2);

        Ticket t1 = new Ticket(101, "Software Bug", Category.SOFTWARE, 4);
        Ticket t2 = new Ticket(102, "Network Issue", Category.HARDWARE, 7);
        Ticket t3 = new Ticket(103, "System Crash", Category.HARDWARE, 10);
        Ticket t4 = new Ticket(104, "Printer Not Working", Category.HARDWARE, 3);
        Ticket t5 = new Ticket(105, "UI Bug", Category.SOFTWARE, 2);
        helpDesk.addTicket(t1, 1);
        helpDesk.addTicket(t2, 2);
        helpDesk.addTicket(t3, 3);
        helpDesk.addTicket(t4, 4);
        helpDesk.addTicket(t5, 5);

        helpDesk.completeTicket("Alice Brown", 101); // Success
        helpDesk.completeTicket("Bob Smith", 102); // Success
        helpDesk.completeTicket("Alice Brown", 103); // Failed (Insufficient points)
        helpDesk.completeTicket("Bob Smith", 104); // Success
        helpDesk.completeTicket("Alice Brown", 105); // Success

        System.out.println("Waiting tickets count: " + helpDesk.getWaitingTicketCount()); // Expected Output: 2
        System.out.println("Completed tickets total points: " + helpDesk.getCompletedTicketsTotalPoint()); // Expected Output: 16
    }
}
