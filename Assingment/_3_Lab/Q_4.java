import java.util.Scanner;
public class Q_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
System.out.print("Enter Array Elements- ");
for (int i = 0; i < arr.length; i++){
arr[i] = sc.nextInt();
}
int largestNum = arr[0];
for (int i = 1; i < arr.length; i++){
if (largestNum < arr[i]){//Main logic here.
largestNum = arr[i];
}
}
System.out.print("\nLargest Element Of Array- "+largestNum);

}
}