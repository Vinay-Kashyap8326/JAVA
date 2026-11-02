import java.util.Scanner;
public class Q_22 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array size: ");
int size = sc.nextInt();
int arr[] = new int [size];
System.out.print("Enter Elements: ");
for (int i = 0 ; i < arr.length; i++){
arr[i] = sc.nextInt();
}
for (int i = 0; i < arr.length-1; i++){
for (int j = 0; j < arr.length-i-1; j++){
if (arr[j] > arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
System.out.print("\nSorted Array: ");
for (int i:arr){
System.out.print(i+" ");
}
sc.close();
}
}