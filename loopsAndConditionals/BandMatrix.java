public class BandMatrix {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int diagonal = 0;
    String pattern = "";
    for (int i = 0; i < n; i++)
    {
      int start = diagonal - width;
      int end = diagonal + width;
      for (int j = 0; j < n; j++ )
        if (j == diagonal || (j >= start && j <= end))
          pattern += "*  ";
        else
          pattern += "0  ";
      diagonal++;
      pattern += "\n";
    }  
    System.out.println(pattern);
  }
}
