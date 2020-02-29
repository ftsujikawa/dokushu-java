package chap03;

public class Chap03Ren321 {
  public static void main(String... args) {
    String value = null;
    System.out.println(value == null ? "値なし" : value);
    value = "あいう";
    System.out.println(value == null ? "値なし" : value);
  }
}
