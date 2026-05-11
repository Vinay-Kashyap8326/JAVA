public class _17_ {
public static void main(String args[]){
int a = 2, b = 0, c;
int arr[] = {1,2,3,4,5};
try {
c = a/b;
arr[10]=5;
} catch (ArithmeticException e){
System.out.println(e.getMessage());
} catch (Exception e){
System.out.println(e.getMessage());
}
}
}