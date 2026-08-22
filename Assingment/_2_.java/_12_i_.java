public class _12_i_ {
void printSum(int a, int b) {
System.out.println("Sum of 2 numbers: " + (a + b));
}
void printSum(int a, int b, int c) {
System.out.println("Sum of 3 numbers: " + (a + b + c));
}
public static void main(String args[]){
_12_i_ obj = new _12_i_();
obj.printSum(5,10);
obj.printSum(5,10,15);
}
}