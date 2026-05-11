public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
          a[i] = 1;   // last element = 1
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          for(int j = i - 1; j > 0; j--) {
            a[j] = a[j] + a[j - 1];
          }
          for(int k = 0; k <= i; k++) {
            System.out.print(a[k] + " ");
          }
          System.out.println();
        }
    }
}