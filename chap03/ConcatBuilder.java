package chap03;

public class ConcatBuilder {
  public static void main(String... args) {
    var builder = new StringBuilder();
  
    for (var i = 0; i < 100000; i++) {
      builder.append("いろは");
    }
    System.out.println(builder);
  }
}
