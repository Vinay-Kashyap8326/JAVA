import java.util.Scanner;
import java.util.Arrays;
public class Q_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size Of Array- ");//Array size input
int size = sc.nextInt();
int arr[] = new int[size];
System.out.print("Enter Array Elements- ");//All array elements input
for (int i = 0; i < arr.length; i++){
arr[i] = sc.nextInt();
}
Arrays.sort(arr); //sort the Array to apply binary search.
System.out.print("Enter Key Value- ");//enter number who wanna search.
int key = sc.nextInt();
int start = 0,end = arr.length-1;//for break in half the array.
boolean exist = false;//if not exist the number in array
while (start <= end){//go to until the last and starting position of array are same.
int mid = (end + start)/2;//find mid value of array.
if (arr[mid] == key){//If our mid value element is equal to key value, it means number founded.
System.out.print("Element Found On Position "+(mid+1));
exist = true;
break;//then terminate the loop.
} else if (arr[mid] > key){//and if mid value element is greater then key value.
end = mid-1;//then take first part of array using update ending value by mid-1.
} else {
start = mid+1; //if mid value element is less thenkey value the take second part of array using update the starting value by mid+1.
}
}
if (!exist){
System.out.print("Element Not Found");
}
}
}