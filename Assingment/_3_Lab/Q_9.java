public class Q_9{
public static void main(String args[]){
int arr[][] = {{1,3},{4,5},{7,9}};
System.out.println("Array -\n");
for (int i = 0;i < arr.length;i++){
for (int j = 0; j < arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
System.out.println("\nTranspose of Array -\n");
for (int i = 0;i < arr[0].length;i++){
for (int j = 0; j < arr.length;j++){
System.out.print(arr[j][i]+" ");
}
System.out.println();
}
}
}