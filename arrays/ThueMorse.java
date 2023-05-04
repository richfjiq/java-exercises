public class ThueMorse {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
  
    String sequence   = "0";
    String opposite  = "1";
    String matrix = "";

    while (sequence.length() < n) {
        String s = sequence;         
        String o = opposite;
        sequence  += o;
        opposite += s;
    }

    String sequence_n = sequence.substring(0, n);

    String[][] a = new String[n][n];
    for (int i = 0; i < sequence_n.length(); i++)
      for (int j = 0; j < sequence_n.length(); j++) {
        int char_i = (int) sequence_n.charAt(i);
        int char_j = (int) sequence_n.charAt(j);
        if (char_i == char_j) {
          a[i][j] = "+";
          if (j == sequence_n.length() - 1) 
            matrix += "+\n";
          else
            matrix += "+  ";
        }
        else {
          a[i][j] = "-";
          if (j == sequence_n.length() - 1) 
            matrix += "-\n";
          else
            matrix += "-  ";
        }
      }

    System.out.println(matrix);
  }
}