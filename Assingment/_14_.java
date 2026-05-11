public class _14_ extends hello {
  void print(){
    System.out.println("Child Class");
  }
  public static void main(String args[]){
    hello obj = new _14_();
    obj.print();
  }
}
class hello{
  void print(){
    System.out.println("Parent Class");
  }
}
