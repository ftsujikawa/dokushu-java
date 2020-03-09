package chap06;

import java.util.ArrayList;

public class CollForeach {
  public static void main(String... args) {
    var data = new ArrayList<String>() {
      /**
       *
       */
      private static final long serialVersionUID = 1L;

      {
        add("バラ");
        add("ひまわり");
        add("あさがお");
      }
    };

    for (var s : data) {
      System.out.println(s);
    }
  }
}
