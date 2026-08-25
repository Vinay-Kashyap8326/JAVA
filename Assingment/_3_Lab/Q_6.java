public class Q_6{
public static void main(String args[]){
int a = 5, b = 10;
System.out.print("Before Swaping a = "+a+" b = "+b);
//Swapping Throw 3rd variable.
int temp = 0;
temp = a;
a = b;
b = temp;
System.out.print("\nAfter Swaping using 3rd variable a = "+a+" b = "+b);
//Swapping Without 3rd variable(using XOR).
//xor me same value hone par wo cancel ho jati hai.
a = a^b; //a me a and b ki mix value aa gayi hai.
b = a^b; //a me mixed value hai jisme se b ka xor karne par ba cancel ho gaya or a bacha jo b me store ho gaya.
a = a^b;//ab b me a ki value hai and a me abhi bhi mixed value now dono ke xor me a cancel ho jayega and b bachega jo a me store ho jaya.
System.out.print("\nAfter Swaping without using 3td variable a = "+a+" b = "+b);
}
}