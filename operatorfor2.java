public class operatorfor2 {
  public static void main(String[] arg) {
    for (int i = 1; i <= 100; i++) {
      if ((i == 5 || i == 7 || i == 11) || (i >= 20 && i <= 30) || (i >= 45 && i <= 55)) {
        continue;
      }
      System.out.println(i);
    }
  }
}
