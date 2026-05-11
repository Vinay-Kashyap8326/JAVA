public class _7_ {
public static void main(String args[]){
int Matrix1[][] = {{0,1},{2,4}};
int Matrix2[][] = {{5,6},{7,8}};
int Added[][] = new int[Matrix1.length][Matrix2[0].length];
for (int i = 0; i < Matrix1.length; i++){
for (int j = 0; j < Matrix1[0].length; j++){
Added[i][j] = Matrix1[i][j] + Matrix2[i][j];
}
}
for (int i = 0; i < Added.length; i++){
for (int j = 0; j < Added[0].length; j++){
System.out.print(Added[i][j] + " ");
}
System.out.println();
}
}
}