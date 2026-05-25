import java.util.*;
public class Even_Odd_Using_bit_Manipulations {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number: ");
int n = sc.nextInt();
int pos = 2;
int bitMask = 1 << pos;
int operation = bitMask ^ n;
System.out.println("Toggle Of "+n+" Is "+operation);
}
}