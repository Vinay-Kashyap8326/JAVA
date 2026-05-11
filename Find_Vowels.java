import java.util.*;
public class Find_Vowels {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
    String Name = sc.nextLine();
    int count = 0;
    for(int i = 0; i < Name.length(); i++) {
      char vowel = Character.toLowerCase(Name.charAt(i));
      if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
        count++;
      }
    }
    System.out.print("Vowels In Your Sentence : "+count);
  }
}