import java.util.*;
public class Even_Odd_Using_bit_Manipulations {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number: ");
int n = sc.nextInt();
int bitMask = 1<<0;
int operation = bitMask & n;
if (operation == 0){
System.out.println(n+" Is EVEN");
} else {
System.out.println(n+" Is ODD");
}
}
}