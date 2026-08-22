import java.util.Scanner;
public class Q_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
System.out.print("Enter Array Elements- ");
for (int i = 0; i < 5; i++){
arr[i] = sc.nextInt();
}
int smallestNum = arr[0],index = 0;
for (int i = 1; i < arr.length; i++){
if (smallestNum > arr[i]){
smallestNum = arr[i];
index = i;
}
}
for (int i = index;i < arr.length-1;i++){
arr[i] = arr[i+1];
}
arr[arr.length-1] = 0;
for (int el : arr){
System.out.print(el+" ");
}
}
}