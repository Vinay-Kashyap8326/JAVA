import java.util.Scanner;
public class Q_1{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int arr[] = new int [10];
System.out.print("Enter Elements Of Array- ");
for (int i = 0;i < arr.length ;i++ ){
arr[i] = sc.nextInt();
}
System.out.print("\nYour Array- ");
for (int el : arr){
System.out.print(el+" ");
}
System.out.print("\n\nYour Reversed Array- ");
for (int i = arr.length-1;i >= 0;i--){
System.out.print(arr[i]+" ");
}
}
}