public class RightTriangle {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    boolean positiveNumbers = a > 0 && b > 0 && c > 0;
    boolean sum1 = (a*a + b*b) == c*c;
    boolean sum2 = (a*a + c*c) == b*b;
    boolean sum3 = (b*b + c*c) == a*a;
    boolean checkSum = sum1 || sum2 || sum3;
    boolean isTriangle = positiveNumbers && checkSum;
    System.out.println(isTriangle);
  }
}
