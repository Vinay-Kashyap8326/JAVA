public class Q_2{
public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6,7,8,9,10};
System.out.print("Array- "); // Showing The Array.
for (int el : arr){
System.out.print(el+" ");
}
System.out.print("\n\nEven Numbers- ");
for (int el : arr){ // if Element will Even then print it.
if (el % 2 == 0){
System.out.print(el+" ");
}
}
System.out.print("\nOdd Numbers- ");
for (int el : arr){ // if Element will Odd then print it.
if (el % 2 != 0){
System.out.print(el+" ");
}
}
}
}