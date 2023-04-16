public class CMYKtoRGB {
  public static void main(String[] args) {
    double white = 1 - Double.parseDouble(args[3]);
    int red = (int) Math.round(255 * white * (1 - Double.parseDouble(args[0])));
    int green = (int) Math.round(255 * white * (1 - Double.parseDouble(args[1])));
    int blue = (int) Math.round(255 * white * (1 - Double.parseDouble(args[2])));
    System.out.println("red   = " + red);
    System.out.println("green = " + green);
    System.out.println("blue  = " + blue);
  }
}
