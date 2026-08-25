import java.util.Scanner;
public class Q_1{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int arr[] = new int [10]; // Declaring Array.
System.out.print("Enter Elements Of Array- ");
for (int i = 0;i < arr.length ;i++ ){ // input All Array Elements.
arr[i] = sc.nextInt();
}
sc.close();
System.out.print("\nYour Reversed Array- ");
for (int i = arr.length-1;i >= 0;i--){ //We printing values from ending to starting. then we got a reverse array.
System.out.print(arr[i]+" ");
}
}
}