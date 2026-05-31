import java.util.*;
public class Insertion_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Length Of Array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    System.out.print("Enter Elements Of Array: ");
    for(int i = 0; i < size; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 1; i < arr.length; i++){
      int current = arr[i];
      int j = i-1;
      for(; j >= 0 && current < arr[j]; j--){
        arr[j+1] = arr[j];
      }
      arr[j+1] = current;
    }
    for(int num : arr){
      System.out.print(num + " ");
    }
  }
}