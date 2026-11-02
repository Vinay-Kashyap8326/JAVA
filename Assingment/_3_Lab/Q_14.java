public class Q_14 {
public static void main(String args[]) {
int arr[] = {10, 20, 30, 10, 40};
System.out.print("Array: ");
for (int i : arr){
System.out.print(i+" ");
}
int element = 10;
System.out.println("\nElement: "+element);
int count = 0;
for (int i : arr) {
if (i == element) {
count++;
}
}
System.out.println("Number of occurrences: " + count);
}
}