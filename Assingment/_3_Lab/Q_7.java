import java.util.Scanner;
public class Q_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size Of Array- "); //Input array size.
int size = sc.nextInt();
int arr[] = new int[size];
System.out.print("Enter Array Elements- "); //input all elements of array.
for (int i = 0; i < arr.length; i++){
arr[i] = sc.nextInt();
}
System.out.print("Enter Key Value- ");//take number who wanna find.
int keyValue = sc.nextInt();
int index = 0;//to show position of number.
boolean exist = false;//if not found element in array.
for (int el : arr){//Reach on all elements.
if (el == keyValue){//If founded then print it with position.
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