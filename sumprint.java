
import java.util.*;

public class sumprint{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        try{
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        System.out.print("The sum of "+a1+ " and "+a2+" is = "+(a1+a2));
    sc.close();
        } catch (InputMismatchException e){
            System.out.println("Please Enter Only numbers");
        }
    }
}