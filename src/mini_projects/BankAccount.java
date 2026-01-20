package mini_projects;
import java.util.*;
public class BankAccount {
	//instance variables
    int accountnumber;
    double balance;
    //constructor
    public BankAccount(int accountnumber,double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    //method to deposite money
    void deposite(double amount){
        balance +=amount;
        System.out.println("Deposited amount : "+amount);
        System.out.println("To view total amount you can check your balance.");
    }
    //method to withdraw money
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance!");
        }else{
            balance -=amount;
            System.out.println("Withdrawn amount : "+amount);
            System.out.println("To view total amount you can check your balance.");
        }
    }
    //method to display total balance
    void displayBalance(){
        System.out.println("Account Number : "+accountnumber);
        System.out.println("Current Balance : "+balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;
        
         System.out.println("Enter Account Number");
             int accNum = sc.nextInt();
             System.out.println("Enter Initial Balance");
             double initialBalance = sc.nextDouble();
             
             BankAccount account = new BankAccount(accNum,initialBalance);
        
        do{
            System.out.println("----------Menu----------");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
                     
             switch(choice){
                 case 1:
                     System.out.println("Enter amount to be deposited");
                     double dep = sc.nextDouble();
                     account.deposite(dep);
                     break;
                case 2:
                     System.out.println("Enter amount to be withdrawn");
                     double wit = sc.nextDouble();
                     account.withdraw(wit);
                     break;
                case 3:
                     account.displayBalance();
                     break;
                case 4:
                     System.out.println("Exiting Goodbye...!");;
                     break; 
                default:
                     System.out.println("Invalid choice :(");
             }   
        }while(choice!=4);

	}

}
