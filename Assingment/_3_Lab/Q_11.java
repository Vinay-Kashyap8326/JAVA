public class Q_11{
static void printArray(int arr[][]){
for (int i = 0;i < arr.length;i++){
for (int j = 0;j < arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[]){
int m1[][] = {{1,2},{3,4}};
int m2[][] = {{5,6},{7,8}};
int mul[][] = new int[m1.length][m2[0].length];
if (m1[0].length != m2.length){
System.out.print("insure that matrices should be R1=C2.");
return;
}
System.out.println("1st Array-\n");
printArray(m1);
System.out.println("\n2nd Array-\n");
printArray(m2);
for (int i = 0;i < m1.length;i++){
for (int j = 0;j < m2[0].length;j++){
for (int k = 0;k < m1[0].length;k++){
mul[i][j] += m1[i][k]*m2[k][j];
}
}
}
System.out.println("\nMultiplied Array-\n");
printArray(mul);
}
}