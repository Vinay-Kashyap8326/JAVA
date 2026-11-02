public class Q_10{
static void printArray(int arr[][]){
for (int i = 0;i < arr.length;i++){
for (int j = 0;j < arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[]){
int M1[][] = {{1,2},{3,4}};
int M2[][] = {{1,2},{3,4}};
if (M1.length != M2.length || M1[0].length != M2[0].length){
System.out.print("insure that matrices should be same order.");
return;
}
System.out.println("1st Array-\n");
printArray(M1);
System.out.println("\n2nd Array-\n");
printArray(M2);
int Sum[][] = new int[M1.length][M1[0].length];
for (int i = 0;i < M1.length;i++){
for (int j = 0;j < M1[0].length;j++){
Sum[i][j] = M1[i][j]+M2[i][j];
}
}
System.out.println("\n3rd Array(Sum)-\n");
printArray(Sum);
}
}