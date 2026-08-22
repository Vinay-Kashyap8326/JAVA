import java.util.*;
public class SwitchExample {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Character (a/b/c/d): ");
char n = sc.next().charAt(0);
switch (n) {
case 'a' : System.out.println("You choose a");
  break;
case 'b' : System.out.println("You choose b");
  break;
case 'c' : System.out.println("You choose c");
  break;
case 'd' : System.out.println("You choose d");
  break;
default : System.out.println("Invalid Choice");
  break;
}
}
}