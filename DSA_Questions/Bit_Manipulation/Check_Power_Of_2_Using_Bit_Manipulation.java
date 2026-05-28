import java.util.*;
public class Check_Power_Of_2_Using_Bit_Manipulation {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number: ");
int n = sc.nextInt(); // n zero se bada hona chahiye jiske liye niche condition lagayi hai
if (n > 0 && (((n-1) & n ) == 0)){ //if 4=>0100 and 4-1=>3=>0011 ab dono ka AND karne par hamesha 0 hi ayega agar 2 ki power me aata hoga to
/* like- 0100
       & 0011
         0000*/
System.out.println(n+" Is Power Of 2");
} else {
System.out.println(n+" Is Not Power Of 2");
}
}
}