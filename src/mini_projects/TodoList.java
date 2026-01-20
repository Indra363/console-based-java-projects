package mini_projects;
import java.util.*;
public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> todolist = new ArrayList<>(); 
	    Scanner sc = new Scanner(System.in);
		int choice;
		do {
			 System.out.println("\n===== To-Do List Menu =====");
			 System.out.println("1. Add a Task");
			 System.out.println("2. View all Task");
			 System.out.println("3. Remove a Task");
			 System.out.println("4. Mark a Task as Complete");
			 System.out.println("5. Exit");
			 System.out.println("Enter your choice(1-5): ");
			 choice = sc.nextInt();
			 sc.nextLine();
			 
			switch(choice) {
			case 1:
				 System.out.print("Enter a new task: ");
				 String task = sc.nextLine();
				 todolist.add(task);
				 System.out.print("Task added.");
				 break;
			case 2:
				 if(todolist.isEmpty()) {
					 System.out.println("Your to-do list is empty.");
				 }else {
					 System.out.println("Your Tasks are: ");
					 for(int i = 0; i < todolist.size(); i++) {
						 System.out.println((i+1)+"."+todolist.get(i));
					 }
				 }
				 break;
			case 3:
				 System.out.print("Enter the number of task to be deleted: ");
				 int num = sc.nextInt();
				 if(num >= 1 && num <= todolist.size()) {
				 todolist.remove(num-1);
				 System.out.print("Task removed.you can view your list.");
				 }else {
				 System.out.print("Invalid task number.");
				 }
				 break;
			case 4:
				 System.out.print("Enter task number to mark as complete: ");
				 int comp = sc.nextInt();
				 if(comp>=1 && comp<=todolist.size()) {
					String taskcomp = todolist.get(comp-1)+"[Completed]";//append completed
					todolist.set(comp-1, taskcomp);
					System.out.print("Marked as completed!!you can view your list.");
				 }else {
					 System.out.print("Invalid task number.");
				 }
				 
				 break;
			case 5:
				 System.out.print("Exiting...Goodbye!! ");
				 break;
			default:
				 System.out.println("Invalid choice. Please select between 1 and 5.");
			}	
		}while(choice != 5);

	}
}
