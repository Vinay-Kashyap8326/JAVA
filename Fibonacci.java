public class Fibonacci{
static void print(int a,int b,int i){
if (i == 0){
return;
}
System.out.print(a+" ");
print(b,a+b,i-1);
}
public static void main(String args[]){
int n = 5;
print(0,1,n);
}
}