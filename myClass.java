package BANKMANAGMENT;
import java.util.Scanner;

public class myClass {

    public static void main(String[] args) {
        Bank B = new Bank();
        int choice;
        Scanner scanner = new Scanner(System.in); 
        while(true) { 
            System.out.println("Welcome to the Bank!");
            System.out.println("1. Add User");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Your name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter Your mobile number: ");
                    int phoneNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Your password: ");
                    int pass = scanner.nextInt();
                    
                    int id = B.addUser(name, phoneNumber, pass);
                    
                    System.out.println("Added Successfully!!");
                    System.out.println("Your Id is  = " + id);
                    System.out.println("Your Password is = " + pass);
                    System.out.println("Keep your Password safe");
                    break;
                  
                case 2 :
                    System.out.println("Enter Your Id number: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Your password: ");
                    int pass1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Enter Amount you want to withdraw: ");
                    int amount = scanner.nextInt();
                
                    B.withdrawal(ID, pass1, amount);
                    break;
                  
                case 3 :
                    System.out.println("Enter Your Id number: ");
                    int ID1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Amount you want to Deposit: ");
                    int amount1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    B.deposit(ID1, amount1);
                    break;
                  
                case 4 :
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
