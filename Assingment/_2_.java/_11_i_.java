public class _11_i_ extends Parent{ // main class.
void Child(){ // Child Class Method
System.out.println("I Am A Child Class");
}
public static void main(String[] args){ // main method.
_11_i_ obj = new _11_i_(); // creating object.
obj.Child(); // calling
obj.Print();
}
}
class Parent{ // inherite class.
void Print(){ // Parent class method.
System.out.println("I Am A Parent Class");
}
}