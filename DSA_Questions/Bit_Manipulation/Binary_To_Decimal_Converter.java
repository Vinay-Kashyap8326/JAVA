import java.util.*;
public class Binary_To_Decimal_Converter {
static void BinaryToDecimal(StringBuilder sb){
int sum = 0;
sb.reverse();
for (int i = 0; i < sb.length(); i++){
int bit = Character.getNumericValue(sb.charAt(i));
bit *= (1<<i);
sum += bit;
}
System.out.print("Decimal Value: "+sum);
}
static void DecimalToBinary(int n,int arr[]){
int index = 0;
while (n > 0){
arr[index] = n&1;
n = n>>1;
index++;
}
System.out.print("Binary Value: ");
for (int i = index-1; i >= 0; i--){
System.out.print(arr[i]);
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[] = new int[10];
System.out.print("1. Decimal To Binary\n2. Binary To Decimal\n\nEnter Option:  ");
int choice = sc.nextInt();
switch (choice){
case 1 -> {
  System.out.print("Enter Number: ");
  int n = sc.nextInt();
  DecimalToBinary(n,arr);
  }
case 2 -> {
  System.out.print("Enter Number: ");
  int userinput = sc.nextInt();
  String binary = Integer.toString(userinput);
  StringBuilder sb = new StringBuilder(binary);
  BinaryToDecimal(sb);
  }
default -> {
  System.out.println("Invalid Option");
  }
  }
  }
  }