import java.util.*;
public class _9_ {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size Of Array: ");
int size = sc.nextInt();
int Arr[] = new int[size];
int even = 0, odd = 0;
System.out.print("Enter Elements Of Array: ");
for (int i = 0; i < size; i++) {
Arr[i] = sc.nextInt();
}
for (int num : Arr) {
if (num % 2 == 0) {
even++;
} else {
odd++;
}
}
System.out.println("Even Numbers: " + even);
System.out.println("Odd Numbers: " + odd);
}
}