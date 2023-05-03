public class DiscreteDistribution {
  public static void main (String[] args) {
    int m = Integer.parseInt(args[0]);    
    int[] a = new int[args.length - 1];
    for (int i = 0; i < args.length - 1; i++)
      a[i] = Integer.parseInt(args[i + 1]);
    int[] s = new int[a.length];
    int cumulative = 0;
    for (int i = 0; i < a.length; i++){
      s[i] = a[i] + cumulative;
      cumulative += a[i];
    }
    int repeat = 0;
    int index = 0;
    String indices = "";
    while (repeat != m) {
      double random = Math.random() * s[s.length - 1];
      repeat += 1;
      for (int i = 0; i < s.length; i++) {
        if (i == 0 && random < s[i])
          index = i;
        if (i > 0 && random >= s[i - 1] && random < s[i])
          index = i;
      }
      if (repeat % 25 == 0)
        indices += index + 1 + "\n";
      else
        indices += index + 1 + " ";
    }
    System.out.println(indices);
  }
}
