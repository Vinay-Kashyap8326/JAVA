import java.applet.*;
import java.awt.*;
public class _20_ extends Applet {
BorderLayout bo1 = new BorderLayout();
Button b1 = new Button("Submit");
Button b2 = new Button("Stop");
public void init(){
setLayout(bo1);
add("East",b1);
add("West",b2);
}
}