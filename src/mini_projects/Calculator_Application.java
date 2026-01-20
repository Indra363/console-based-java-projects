package mini_projects;
import java.util.*;
public class Calculator_Application {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to our Calculatorn Application!!");
		//Take input from user and decide the operation
		
		do {
			System.out.println("Choose an Operation: (+ ,-, *, /)");
			System.out.print("->");
			String input = sc.next();
			char ch = input.charAt(0);
			if(input.length()!=1) {
				System.out.println("Wrong input, please try again");
			}
			else {
				ChooseOperatio(ch);
			}
			boolean exit= exitProgram();	
			if(exit) {//i.e. exit==true
			     break;
			}
		}while(true);
		System.out.println("Thanks for using our service!!");
	}	
		
		public static void ChooseOperatio(char ch) {
			
			switch(ch) {
			case '+':
				int num1 = getInteger();
				int num2 = getInteger();
				System.out.println("Addition result->"+ (num1+num2));
				break;
			case '-':
				int num3 = getInteger();
				int num4 = getInteger();
				System.out.println("Substraction result->"+ (num3-num4));
				break;
			case '*':
				int num5 = getInteger();
				int num6 = getInteger();
				System.out.println("Multiplication result->"+ (num5*num6));
				break;
			case '/':
				int num7 = getInteger();
				int num8 = getInteger();
				if(num8 == 0) {
					System.out.print("Divide by zero error");
					break;
				}
				System.out.println("Division result->"+ (num7/num8));
				break;
			case '%':
				int num9 = getInteger();
				int num10 = getInteger();
				if(num10 == 0) {
					System.out.print("Divide by zero error");
					break;
				}
				System.out.println("Modulo result->"+ (num9%num10));
				break;
			default:
				System.out.println("Unknown Operation!!");
				//we can or can't use break here
			}
	}

		public static int getInteger() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number for further Calculation...");
			int num = sc.nextInt();
			return num;
		}

		public static boolean exitProgram() {
			Scanner sc = new Scanner(System.in);
			int times = 0;
			int retry = 3;
			boolean exit = false;
			for(times=0; times<retry; times++) {
			System.out.println("Do you want to continue?? Choose(y/n)");
			String continueInput = sc.next();
			char ch1 = continueInput.charAt(0);	
			if(continueInput.length() == 1 && ch1 == 'n') {
				return true;
			}
			else if(continueInput.length() == 1 && ch1 == 'y') {
				return false;
			}
			else {
				System.out.println("Wrong input, please try again");
			}
			}
			
			
			if(times >= retry) {
				System.out.println("Maximum retry exceeded!!Exiting...");
				return true;
			}
			return false;
		}
}
