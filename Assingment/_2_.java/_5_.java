public class _5_ {
public static void main(String args[]){
int Arr[] = {65, 47, 68, 34, 65, 31, 40, 20};
int max = Arr[0], min = Arr[0];
for(int num : Arr){
if(num > max){
  max = num;
}
if(num < min ){
  min=num;
}
}
System.out.println("Maximum Number: " + max);
System.out.println("Minimum Number: " + min);
}
}