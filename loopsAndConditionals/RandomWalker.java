public class RandomWalker {
  public static void main (String[] args) {
    int r = Integer.parseInt(args[0]);
    int distance = 0;
    int x = 0;
    int y = 0;
    int steps = 0;
    String coordinates = "(0, 0)\n";

    while (distance != r)
    {
      int random = (int) (Math.random() * 4);
      
      if (random == 0) y += 1;
      if (random == 1) x += 1;
      if (random == 2) y -= 1;
      if (random == 3) x -= 1;

      coordinates += "(" + (int) x + ", " + (int) y + ")\n";
      distance = Math.abs(x) + Math.abs(y);
      steps += 1;
    }

    coordinates += "steps = " + (int) steps;
    System.out.println(coordinates);
  }
}
