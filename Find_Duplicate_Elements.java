public class Find_Duplicate_Elements{
public static void main(String args[]){
String Name = "Vinay Kashyap";
for (int i = 0;i < Name.length();i++){
for (int j = i+1;j < Name.length();j++){
if (Name.charAt(i) == Name.charAt(j)){
System.out.println(Name.charAt(i)+" Repeat on "+j+" th position");
}
}
}
}
}