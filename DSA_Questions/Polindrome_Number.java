class Palindrome_Number {
  public static boolean isPalindrome(int x) {
    if(x < 0) return false;
    int original = x;
    int reverse = 0;
    while(x > 0) {
      int reminder = x%10;
      reverse = reverse*10+reminder;
      x = x/10;
    }
    return original == reverse;
  }
  public static void main(String[] args) {
    int x = 12321;
    System.out.println(isPalindrome(x));
  }
}