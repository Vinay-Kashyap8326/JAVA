import java.util.Scanner;
public class Q_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size Of Array- ");
int size = sc.nextInt();
int arr[] = new int[size];
System.out.print("Enter Array Elements- ");
for (int i = 0; i < arr.length; i++){
arr[i] = sc.nextInt();
}
System.out.print("Enter Key Value- ");
int keyValue = sc.nextInt();
int index = 0;
boolean exist = false;
for (int el : arr){
if (el == keyValue){
System.out.print("Element Found On "+(index+1)+" Position");
exist = true;
}
index++;
}
if (!exist){
System.out.print("Element Not Founded");
}
}
}