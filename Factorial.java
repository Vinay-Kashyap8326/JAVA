import java.util.Scanner;
public class Factorial{
  public static void fact(int a){
    if(a<0){
      System.out.print("Invalid Number");
      return;
    }
    int facto=1;
    for(int i=1;i<=a;i++){
      facto*=i;
    } 
    System.out.print("Factorial Is : "+facto);
  }
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number : ");
    int a=sc.nextInt();
    fact(a);
  }
}