public class Insertion_sort {
  public static void main(String[] args) {
    int arr[] = {5,4,3,2,1};
    for(int i = 1; i < arr.length; i++){
      int current = arr[i];
      int j = i-1;
      for(; j >= 0 && current < arr[j]; j--){
        arr[j+1] = arr[j];
      }
      arr[j+1] = current;
    }
  }
}