public class Reverse_String_Using_StringBuilder {
public static void main(String args[]){
StringBuilder sb = new StringBuilder("Reverse String");
for (int i = 0; i < sb.length()/2; i++){
char front = sb.charAt(i);
char back = sb.charAt(sb.length()-1-i);
sb.setCharAt(i,back);
sb.setCharAt((sb.length()-1-i),front);
}
System.out.println(sb);
}
}