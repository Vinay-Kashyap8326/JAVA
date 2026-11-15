import java.util.Scanner;
public class Practice{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array size: ");
int size = sc.nextInt();
int arr[] = new int [size];
System.out.print("Enter Elements: ");
for (int i = 0 ; i < arr.length; i++){
arr[i] = sc.nextInt();
}
for (int i = 0;i < arr.length-1;i++){
boolean isSorted = true;
for (int j = 0;j < arr.length-1-i;j++){
if (arr[j] > arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
isSorted = false;
}
}
if (isSorted){
System.out.print("Array Already Sorted.");
return;
}
}
System.out.print("Sorted Array: ");
for (int el: arr){
System.out.print(el+" ");
}
}
}