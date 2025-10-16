public class InspectSA {
  public static void main(String[] args) {
    String index = args[0];
    int sample_rate = 0;
    try {
      sample_rate = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.err.println("Invalid integer sanmple rate.");
    }
    String output = args[2];
  }
}
