public class GreatCircle {
  public static void main(String[] args) {
    double r = 6371.0;
    double x1 = Math.toRadians(Double.parseDouble(args[0]));
    double y1 = Math.toRadians(Double.parseDouble(args[1]));
    double x2 = Math.toRadians(Double.parseDouble(args[2]));
    double y2 = Math.toRadians(Double.parseDouble(args[3]));
    double d1 = Math.pow(Math.sin((x2 - x1) / 2), 2);
    double d2 = Math.cos(x1) * Math.cos(x2);
    double d3 = Math.pow(Math.sin((y2 - y1) / 2), 2);
    double discriminant = d1 + d2 * d3;
    double sqrt = Math.sqrt(discriminant);
    double result = 2 * r * Math.asin(sqrt);
    System.out.println(result + " kilometers");
  }  
}
