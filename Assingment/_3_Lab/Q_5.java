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
smallestNum = arr[i];//find smallest value.
index = i;//And also take his index
}
}
for (int i = index;i < arr.length-1;i++){//Shift other elements.
arr[i] = arr[i+1];//shifting main logic.
}
arr[arr.length-1] = 0;//To show last elements also empty.
for (int el : arr){//Show array.
System.out.print(el+" ");
}
}
}