public class Spiral_Matrix {
public static void main(String args[]) {
int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
int srow = 0,scol = 0,erow = arr.length-1,ecol = arr[0].length-1;
while (srow <= erow && scol <= ecol){ //jab dono row ya column ek ho jayenge means sare elements print ho chuke hai
//upper row
for (int i = scol; i <= ecol; i++){ //yaha par row ke andar ke all columns lene the isliye arr[start] likha hai
System.out.print(arr[srow][i]+" ");
}
//right side column
for (int i = srow+1; i <= erow; i++){
System.out.print(arr[i][ecol]+" ");
}
//last row
for (int i = ecol-1; i >= scol; i--){
if (srow == erow) break;// agar ye equal hone par nhi ruke to odd matrix me ye overlap kar jayega isley ye likha hai
System.out.print(arr[erow][i]+" ");
}
//left side column
for (int i = erow-1; i > srow; i--){
if (scol == ecol) break; //same line 16 ke comment ki tarah
System.out.print(arr[i][scol]+" ");
}
srow++;// all updations to print inner matrix elements
scol++;
erow--;
ecol--;
}
}
}