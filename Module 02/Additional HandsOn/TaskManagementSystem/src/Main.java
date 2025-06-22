class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }
}
class TaskManager {
    Task head = null;

    void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) head = newTask;
        else {
            Task temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newTask;
        }
    }

    Task search(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    void delete(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task prev = head, curr = head.next;
        while (curr != null && curr.taskId != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) prev.next = curr.next;
    }

    void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Status: " + temp.status);
            temp = temp.next;
        }
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskManager manager = new TaskManager();
        manager.addTask(1, "Design Module", "Pending");
        manager.addTask(2, "Implement Logic", "In Progress");
        manager.addTask(3, "Test Application", "Pending");
        manager.addTask(4, "Deploy Project", "Not Started");
        System.out.println("All Tasks:");
        manager.displayTasks();
        int searchId = 3;
        Task found = manager.search(searchId);
        if (found != null) {
            System.out.println("\nTask Found (ID: " + searchId + "):");
            System.out.println("ID: " + found.taskId + ", Name: " + found.taskName + ", Status: " + found.status);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }
        int deleteId = 2;
        System.out.println("\nDeleting Task with ID: " + deleteId);
        manager.delete(deleteId);
        System.out.println("\nTasks after deletion:");
        manager.displayTasks();
	}

}
