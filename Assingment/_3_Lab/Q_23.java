import java.util.Scanner;
public class Q_23{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array size: ");
int size = sc.nextInt();
int arr[] = new int [size];
System.out.print("Enter Elements: ");
for (int i = 0 ; i < arr.length; i++){
arr[i] = sc.nextInt();
}
for (int i = 1; i < arr.length; i++){
int prev = i-1;
int curr = arr[i];
while (prev >= 0 && curr < arr[prev]){
arr[prev+1] = arr[prev];
prev--;
}
arr[prev+1] = curr;
}
System.out.print("\nSorted Array: ");
for (int i:arr){
System.out.print(i+" ");
}
sc .close();
}
}