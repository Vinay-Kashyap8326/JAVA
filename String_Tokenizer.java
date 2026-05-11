import java.util.*;
public class String_Tokenizer {
public static void main(String[] args) {
String str = "Java is very easy";
StringTokenizer st = new StringTokenizer(str);
while (st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}