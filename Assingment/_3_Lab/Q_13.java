public class Q_13 {
public static void main(String args[]) {
int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
System.out.println("Array -\n");
for (int i = 0;i < arr.length;i++){
for (int j = 0; j < arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
int sum = 0;
int n = arr.length;
for (int i = 0; i < n; i++) {
sum += arr[i][i];
sum += arr[i][n - 1 - i];
}
System.out.println("\nSum of both diagonals: " + sum);
}
}