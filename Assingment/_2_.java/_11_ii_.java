public class _11_ii_ extends Parent{
void Child(){ // Child Class Method
System.out.println("I Am A Child Class");
}
public static void main(String[] args){ // main method.
_11_ii_ obj = new _11_ii_(); // creating object.
obj.Child(); // calling
obj.Print();
obj.Hello();
}
}
class Grand_Parent{
void Hello(){
System.out.println("I Am A Grand Parent Class");
}
}
class Parent extends Grand_Parent{
void Print(){
System.out.println("I Am A Parent Class");
}
}