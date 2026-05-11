public class prime_number {
  public static void main(String args[]) {
    int n = 170;
    boolean check = true;
    if(n >= 2) {
      for(int i = 2; i <= Math.sqrt(n); i++) {
        if(n%i == 0) {
          check = false;
          break;
        }
      }
      if(check) {
        System.out.println("Prime");
      }else {
        System.out.println("Prime not");
      }
    } else {
      System.out.println("Not prime");
    }
  }
}