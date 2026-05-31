import java.util.*;
public class Selection_Sort {
public static void main(String[] args) {
int arr[] = {1,8,3,0,4};
for (int i = 0; i < arr.length-1; i++){
int n = i;
for (int j = i+1; j < arr.length; j++){
if (arr[n] > arr[j]){
n = j;
}
}
int swap = arr[n];
arr[n] = arr[i];
arr[i] = swap;
}
for (int num:arr){
System.out.print(num + " ");
}
}
}