package BANKMANAGMENT;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    ArrayList<Customer> users = new ArrayList<>();

    public int addUser(String name, int mobileNo, int password) {
        Customer c = new Customer();
        c.Name(name);
        c.MobileNo(mobileNo);
        c.setPassword(password);
        c.Id(users.size() + 1);
        users.add(c);
        return c.Id();
    }

    public void deposit(int accNo, double amount) {
        for (Customer cos : users) {
            if (cos.Id() == accNo) {
                cos.setBalance(cos.Balance() + amount);
                return;
            }
        }
        System.out.println("Invalid user");
    }

    public void withdrawal(int accNo, int pass, double amount) {
        for (Customer cos : users) {
            if (cos.Id() == accNo) {
                if (pass == cos.getPassword()) {
                    if (cos.Balance() >= amount) {
                        cos.setBalance(cos.Balance() - amount);
                        return;
                    } else {
                        System.out.println("Balance is less than withdrawal amount");
                        return;
                    }
                } else {
                    System.out.println("Invalid Password");
                    return;
                }
            }
        }
        System.out.println("User not found !! Enter a valid Account no ");
    }
}
