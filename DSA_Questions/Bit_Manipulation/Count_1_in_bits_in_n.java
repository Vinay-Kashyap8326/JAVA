public class Count_1_in_bits_in_n {
public static void main(String args[]) {
int n = 14;
int count = 0;
for (int i = 0; n > 0; i++){
if ((1 & n) != 0) count++;
n = n>>1;
}
System.out.print(count);
}
}