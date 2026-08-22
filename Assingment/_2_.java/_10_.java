public class _10_ { //class
String name = "vinay"; //instance variables.
int age = 18;
static String city = "Lucknow"; //Static variable.
void print(){ //method.
  System.out.println("Hello");
}
public static void main(String[] args){ //main method.
_10_ obj = new _10_(); //object creation.
int newAge = 19; //Local variable.
obj.print();//method call.
System.out.println("Name: "+obj.name); 
System.out.println("Current Age: "+newAge);
System.out.println("City: "+city);
}
}