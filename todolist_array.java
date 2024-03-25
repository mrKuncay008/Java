import java.util.ArrayList;
import java.util.Scanner;

public class todolist_array {
  private ArrayList<String> tasks;
  private Scanner scanner;

  public todolist_array() {
    tasks = new ArrayList<String>();
    scanner = new Scanner(System.in);
  }

  public void addTask() {
    System.out.print("Masukan List: ");
    String task = scanner.nextLine();
    tasks.add(task);
  }

  public void removeTask() {
    System.out.print("Hapus List: ");
    String task = scanner.nextLine();
    tasks.remove(task);
  }

  public void displayTasks() {
    for (String task : tasks) {
      System.out.println(task);
    }
  }

  public static void main(String[] args) {
    todolist_array list = new todolist_array();
    list.addTask();
    list.addTask();
    list.addTask();
    list.addTask();
    list.addTask();
    list.addTask();
    list.addTask();
    list.addTask();
    list.displayTasks();
    list.removeTask();
    System.out.println("After removing a task:");
    list.displayTasks();
  }
}
