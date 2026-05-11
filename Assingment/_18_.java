public class _18_ {
public static void main(String args[]){
int a = 2,b = 0,c;
try {
c = a/b;
} catch (ArithmeticException e){
System.out.println(e.getMessage());
} finally {
System.out.println("End of code");
}
}
}