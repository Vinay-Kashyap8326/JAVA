public class Q_12 {
public static void main(String args[]) {
int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
if (arr.length != arr[0].length){
System.out.print("Right diagonal sum requires a square matrix.");
return;
}
System.out.println("Array-");
for (int i = 0;i < arr.length;i++){
for (int j = 0;j < arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
int sum = 0;
for (int i = 0; i < arr.length; i++) {
sum += arr[i][arr.length - 1 - i];
}
System.out.println("\nSum of right diagonal: " + sum);
}
}