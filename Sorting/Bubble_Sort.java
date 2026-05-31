import java.util.Scanner;
public class Bubble_Sort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.print("Enter elements: ");
for (int i = 0; i < size; i++) {
arr[i] = sc.nextInt();
}
for (int i = 0; i < arr.length - 1; i++) {
boolean sorted = true;
for (int j = 0; j < arr.length - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
sorted = false; // swap hua
}
}
if (sorted) break; // agar swap nahi hua to array sorted hai
}
System.out.print("Sorted Array: ");
for (int num: arr) {
System.out.print(num + " ");
}
sc.close();
}
}