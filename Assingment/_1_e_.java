public class _1_e_ {
public static void main(String args[]) {
int n = 1,m = 1,o = 0,p = 0;
System.out.println(n&m);//1
System.out.println(n&o);//0
System.out.println(o&m);//0
System.out.println(o&p);//0
System.out.println(n|m);//1
System.out.println(n|o);//1
System.out.println(o|m);//1
System.out.println(o|p);//0
System.out.println(n^m);//0
System.out.println(o^m);//1
System.out.println(n^p);//1
System.out.println(o^p);//0
}
}