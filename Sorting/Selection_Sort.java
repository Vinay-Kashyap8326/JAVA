import java.util.Scanner;
public class Selection_Sort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Length Of Array: ");
int size = sc.nextInt();
int arr[] = new int [size];
System.out.print("Enter Elements Of Array: ");
for (int i = 0; i < size; i++){
arr[i] = sc.nextInt();
}
for (int i = 0; i < arr.length-1; i++){
int n = i;
for (int j = i+1; j < arr.length; j++){
if (arr[n] > arr[j]){
n = j;
}
}
int swap = arr[n];
arr[n] = arr[i];
arr[i] = swap;
}
System.out.print("Sorted Array: ");
for (int num: arr) {
System.out.print(num + " ");
}
}
}