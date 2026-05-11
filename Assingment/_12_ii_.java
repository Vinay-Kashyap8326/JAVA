public class _12_ii_ {
void printSum(int a, int b) {
System.out.println("Integer Sum: " + (a + b));
}
void printSum(float a, float b) {
System.out.println("Float Sum: " + (a + b));
}
public static void main(String args[]){
_12_ii_ obj = new _12_ii_();
obj.printSum(5,10);
obj.printSum(4.5f,10.5f);
}
}