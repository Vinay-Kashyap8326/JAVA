public class _4_ {
  public static void main(String args[]){
    int Arr[] = {65, 47, 68, 34, 65, 31, 40, 20};
    int even =0, odd=0;
    for(int elements : Arr){
      if(elements % 2 == 0){
        even++;
      } else {
        odd++;
      }
    }
    System.out.println("Even Numbers : " + even);
    System.out.println("Odd Numbers : " + odd);
  }
}