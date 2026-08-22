import java.util.Scanner;
public class Q_3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = new int[6];
System.out.print("Enter Array Elements- ");
for (int i = 0;i < arr.length-1 ;i++){
arr[i] = sc.nextInt();
}
System.out.print("Enter Number To Insert- ");
int num = sc.nextInt();
int pos1 = arr.length-1,pos2 = arr.length-2;
for (int i = arr.length-1;i > 2 ; i--){
arr[pos1] = arr[pos2];
pos1--;
pos2--;
}
arr[2] = num;
System.out.print("New Array- ");
for (int el : arr){
System.out.print(el+" ");
}
}
}