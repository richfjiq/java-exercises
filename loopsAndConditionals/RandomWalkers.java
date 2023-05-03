public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int total_steps = 0;

    for (int i = 0; i < trials; i++)
    {
      int distance = 0;
      int x = 0;
      int y = 0;
      int steps = 0;

      while (distance != r)
      {
        double random = Math.random();
        
        if (random < 0.25) y += 1;
        if (random < 0.5) x += 1;
        if (random < 0.75) y -= 1;
        if (random < 1) x -= 1;

        distance = Math.abs(x) + Math.abs(y);
        steps += 1;
      }

      total_steps += steps;
    }

    System.out.println("average number of steps = " + (double) total_steps / trials);
  }
}
