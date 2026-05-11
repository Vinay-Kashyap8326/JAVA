import java.applet.*;
import java.awt.*;
public class _19_ extends Applet {
GridLayout g1 = new GridLayout(2,2);
Button b1 = new Button("one");
Button b2 = new Button("two");
Button b3 = new Button("three");
Button b4 = new Button("four");
public void init(){
setLayout(g1);
add(b1);
add(b2);
add(b3);
add(b4);
}
}