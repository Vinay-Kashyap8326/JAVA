import java.util.Scanner;
public class My_ATM {
  private int pin = 1234;
  private double Accountbalance = 10000;
  double setDeposit(double depositamount) {
    Accountbalance += depositamount;
    return Accountbalance;
  }
  void getBalance() {
    System.out.println("\nYour Current Account Balance : ₹ " + Accountbalance);
  }
  double setWithdraw(double withdrawAmount) {
    Accountbalance -= withdrawAmount;
    return Accountbalance;
  }
  void setPin(int newPin) {
    pin = newPin;
    System.out.println("\nPIN Successfully Changed.");
  }
  boolean checkPin(int userpin) {
    if(userpin == pin) {
      System.out.println("Confirmation : SUCCESS");
      return false;
    } else {
      System.out.print("Confirmation : CANCEL\n\nEnter PIN Again : ");
      return true;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    My_ATM obj = new My_ATM();
    System.out.print("Enter Your Name : ");
    String name = sc.nextLine();
    System.out.print("Enter Your 4 Digit PIN — ");
    boolean check = true;
    while(check) {
      int userpin = sc.nextInt();
      check = obj.checkPin(userpin);
    }
    sc.nextLine(); //to clear buffer, its very imp.
    System.out.println("\nWELCOME " + name.toUpperCase());
    boolean check4 = false;
    while(!check4) {
      System.out.println("\nWhat do you want to do —");
      System.out.println("\n(a). Money Deposit");
      System.out.println("(b). Cash Withdraw");
      System.out.println("(c). PIN Change");
      System.out.println("(d). Balance Enquiry");
      System.out.println("(e). EXIT");
      System.out.print("\nEnter Only Option : ");
      String option = sc.nextLine();
      switch(option) {
        case "a":
        while(true) {
          System.out.print("\nEnter Amount : ");
          double depositamount = sc.nextDouble();
          sc.nextLine();
          if(depositamount > 0) {
            obj.setDeposit(depositamount);
            System.out.println("\nMoney successfully deposited.");
            break;
          } else {
            System.out.println("Invalid Amount\n\nEnter Amount Again : ");
          }
        }
        obj.getBalance();
        break;
        case "b":
        System.out.print("\nEnter Amount : ");
        while(true) {
          double withdrawAmount = sc.nextDouble();
          sc.nextLine();
          if(withdrawAmount <= 0) {
            System.out.println("Invalid Amount\n\nEnter Amount Again : ");
            continue;
          } else if(withdrawAmount > obj.Accountbalance) {
            System.out.println("Insufficient Balance\n\nEnter Amount Again : ");
          } else {
            obj.setWithdraw(withdrawAmount);
            System.out.println("\nMoney successfully Withdraw.");
            break;
          }
        }
        obj.getBalance();
        break;
        case "c":
        boolean check2 = true;
        System.out.print("Enter previous PIN : ");
        while(check2) {
          int oldPin = sc.nextInt();
          check2 = obj.checkPin(oldPin);
        }
        sc.nextLine();
        boolean check3 = false;
        while(!check3) {
          System.out.print("Enter New 4 digit PIN : ");
          int newPin = sc.nextInt();
          if(1000 <= newPin && newPin <= 9999) {
            obj.setPin(newPin);
            sc.nextLine();
            check3 = true;
          } else {
            System.out.println("Invalid PIN, Must Be 4 Digits...");
          }
        }
        break;
        case "d":
        obj.getBalance();
        break;
        case "e": System.out.println("Thanks, Visit Again.");
        check4 = true;
        break;
        default: System.out.print("\nPlease Enter only (a,b,c,d,e) : ");
      }
    }
  }
}