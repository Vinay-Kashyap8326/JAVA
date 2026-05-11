public class _11_iii_ extends Father {
void child(){
System.out.println("I Am A Chlid Class");
}
public static void main(String[] args) {
_11_iii_ obj = new _11_iii_();
Mother obj1= new Mother();
obj.child();
obj.Namaste();
obj1.Namaste();
obj1.hello();
//obj.hello(); Error
}
}
class Father {
void Namaste(){
System.out.println("I Am Father Class");
}
}
class Mother extends Father{
void hello(){
System.out.println("I Am Mother Class");
}
}