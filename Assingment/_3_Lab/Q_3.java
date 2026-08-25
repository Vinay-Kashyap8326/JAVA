import java.util.Scanner;
public class Q_3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = new int[6]; //Taking 1 extra length to place element on 3rd position.
System.out.print("Enter Array Elements- ");
for (int i = 0;i < arr.length-1 ;i++){
arr[i] = sc.nextInt();
}
System.out.print("Enter Number To Insert- "); //Insert Placed value.
int num = sc.nextInt();
int pos1 = arr.length-1,pos2 = arr.length-2; //For shifting the elements after 3rd position.
for (int i = arr.length-1;i > 2 ; i--){ //Now we shift elements from 3rd position to last position and make 3rd position empty.
arr[pos1] = arr[pos2];
pos1--;
pos2--;
}
arr[2] = num;//Now we place value on 3rd position.
System.out.print("New Array- ");//Show array after insertion.
for (int el : arr){
System.out.print(el+" ");
}
}
}