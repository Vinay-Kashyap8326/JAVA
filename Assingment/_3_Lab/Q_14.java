import java.util.Scanner;
public class Q_14{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = {4,2,4,5,6,4,8,4,4,2,5,8};
System.out.print("Array: ");
for (int el : arr){
System.out.print(el+" ");
}
System.out.print("\nEnter Element: ");
int element = sc.nextInt();
int count = 0;
for (int el : arr){
if (el == element){
count++;
}
}
System.out.print(element+" occurs "+count+" times in Array.");
}
}