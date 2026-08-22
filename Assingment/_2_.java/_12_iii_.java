public class _12_iii_ {
void printSum(int a, float b) {
System.out.println("Sum: " + (a + b));
}
void printSum(float a, int b) {
System.out.println("Sum: " + (a + b));
}
public static void main(String args[]){
_12_iii_ obj = new _12_iii_();
obj.printSum(5,10.5f);
obj.printSum(4.5f,10);
}
}