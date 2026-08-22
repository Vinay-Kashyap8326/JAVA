import java.util.Scanner;
import java.util.Arrays;
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
Arrays.sort(arr);
System.out.print("Enter Key Value- ");
int key = sc.nextInt();
int start = 0,end = arr.length-1;
boolean exist = false;
while (start <= end){
int mid = (end + start)/2;
if (arr[mid] == key){
System.out.print("Element Found On Position "+(mid+1));
exist = true;
break;
} else if (arr[mid] > key){
end = mid-1;
} else {
start = mid+1;
}
}
if (!exist){
System.out.print("Element Not Found");
}
}
}