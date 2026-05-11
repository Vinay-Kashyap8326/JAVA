import java.util.*;
public class Palindrome{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your Word : ");
        String Name = sc.nextLine().toLowerCase();
        boolean check = true;
        char front[] = new char[Name.length()];
        char reverse[] = new char[Name.length()];
        for(int i=0;i<front.length;i++){
          front[i] = Name.charAt(i);
        }
        for(int i=Name.length()-1;i>=0;i--){
          reverse[Name.length()-1-i] = Name.charAt(i);
        }
        for(int i=0;i<Name.length();i++){
          if(reverse[i]!=front[i]){
            check = false;
            break;
          }
        }
        if(check){
          System.out.print("It's Palindrom");
        } else{
          System.out.print("It's Not Palindrom");
        }
    }
}